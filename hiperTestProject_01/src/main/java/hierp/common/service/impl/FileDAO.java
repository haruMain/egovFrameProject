package hierp.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import hierp.common.domain.vo.FileVO;

@Repository("FileDAO")
public class FileDAO extends EgovAbstractMapper {
	@Autowired
	@Qualifier("sqlSessionTemplate")
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSession getBatchSqlSession() {
		return sqlSessionTemplate;
	}
//	파일 추가
	public void save(FileVO fileVO) {
		sqlSessionTemplate.insert("FileMapper.insert",fileVO);
	}
//	파일 삭제
	public void remove(Long boardNum) {
		sqlSessionTemplate.delete("FileMapper.delete", boardNum);
	}
//	파일 조회
	public List<FileVO> selectAll(Long boardNum) {
		return selectList("FileMapper.selectAll");
	}
}