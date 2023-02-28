package hierp.common.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import hierp.common.domain.vo.ReplyVO;

@Repository("ReplyDAO")
public class ReplyDAO extends EgovAbstractMapper {
	@Autowired
	@Qualifier("sqlSessionTemplate")
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSession getBatchSqlSession() {
		return sqlSessionTemplate;
	}
//	추가
	public void save(ReplyVO replyVO) {
		sqlSessionTemplate.insert("ReplyMapper.insert",replyVO);
	}
//	수정
	public void modify(ReplyVO replyVO) {
		sqlSessionTemplate.update("ReplyMapper.update",replyVO);
	}
//	삭제
	public void remove(ReplyVO replyVO) throws Exception {
		sqlSessionTemplate.delete("ReplyMapper.delete", replyVO);
	}
	
//	전체조회
	public List<ReplyVO> findAll(Long boardNum) throws Exception {
		return selectList("ReplyMapper.selectAll", boardNum);
	}

//	단일 조회
	public ReplyVO replySelect(ReplyVO replyVO) throws Exception {
		return sqlSessionTemplate.selectOne("ReplyMapper.selectOne", replyVO);
	}

}
