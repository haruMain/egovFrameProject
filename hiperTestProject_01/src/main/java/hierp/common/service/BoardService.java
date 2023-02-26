package hierp.common.service;

import java.util.List;

import hierp.common.domain.vo.BoardVO;

public interface BoardService {

//  추가
  public void register(BoardVO boardVO);
//    수정
  public void modify(BoardVO boardVO);
//    삭제
  public void remove(Long boardNum);
//    조회
  public BoardVO show(Long boardNum);
//	전체조회
	public List<BoardVO> showAll();
}
