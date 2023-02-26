package hierp.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import hierp.common.domain.vo.BoardVO;

@Repository("BoardDAO")
public class BoardDAO extends EgovAbstractMapper {
	@Autowired
	@Qualifier("sqlSessionTemplate")
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSession getBatchSqlSession() {
		return sqlSessionTemplate;
	}
//	추가
	public void save(BoardVO boardVO) {
		sqlSessionTemplate.insert("BoardMapper.insert",boardVO);
	}
//	수정
	public void setBoardVO(BoardVO boardVO) {
		sqlSessionTemplate.update("BoardMapper.update",boardVO);
	}
//	삭제
	public void remove(Long boardNum) {
		sqlSessionTemplate.delete("BoardMapper.delete", boardNum);
	}
//	조회
	public BoardVO findById(Long boardNum) {
		return selectOne("BoardMapper.select",boardNum);
	}
	
//	전체조회
	public List<BoardVO> findAll() {
		return selectList("BoardMapper.selectAll");
		
	}
	

}
