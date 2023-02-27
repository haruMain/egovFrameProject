package hierp.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;

@Repository("UserDAO")
public class UserDAO extends EgovAbstractMapper {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSession getBatchSqlSession() {
		return sqlSessionTemplate;
	}
	
//	회원가입
	public void save(UserVO userVO) {
		sqlSessionTemplate.insert("UserMapper.insert",userVO);
	}
	
//	조회
	public UserVO findById(String userId) {
		return (UserVO) selectList("UserMapper.select",userId);
	}
	
//	전체조회
	public List<UserVO> findAll() {
		return selectList("UserMapper.selectAll");
	}
	
//	로그인 처리
	public String login(LoginDTO loginDTO) {
		return selectOne("UserMapper.login", loginDTO);
	}
}
