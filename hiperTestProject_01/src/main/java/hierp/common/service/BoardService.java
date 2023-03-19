package hierp.common.service;

import java.util.List;
import java.util.Map;

import hierp.common.domain.vo.BoardDTO;
import hierp.common.domain.vo.BoardVO;
import hierp.common.domain.vo.Criteria;

public interface BoardService {

//  추가
  public void register(BoardDTO boardDTO);
//    수정
  public void modify(BoardDTO boardDTO);
//    삭제
  public void remove(Long boardNum);
//    조회
  public BoardDTO show(Long boardNum);
//	전체조회
  public List<BoardVO> showAll();
//  페이징
  public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
//  갯수
  public int countBoardListTotal();
}
