package hierp.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hierp.common.domain.vo.BoardVO;
import hierp.common.service.BoardService;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;

//	추가
	@Override
	public void register(BoardVO boardVO) {
		boardDAO.save(boardVO);
	}

//	수정
	@Override
	public void modify(BoardVO boardVO) {
		boardDAO.setBoardVO(boardVO);
	}

//	삭제
	@Override
	public void remove(Long boardNum) {
		boardDAO.remove(boardNum);
	}

//	조회
	@Override
	public BoardVO show(Long boardNum) {
		return boardDAO.findById(boardNum);
	}

//	전체조회
	@Override
	public List<BoardVO> showAll() {
		return boardDAO.findAll();
	}

}
