package hierp.common.service;

import java.util.List;

import hierp.common.domain.vo.BoardVO;
import hierp.common.domain.vo.ReplyVO;

public interface ReplyService {
//  추가
  public void register(ReplyVO replyVO);
//  수정
  public void modify(ReplyVO replyVO) throws Exception;
//  삭제
  public void remove(Long replyNum) throws Exception;
//	전체조회
	public List<ReplyVO> showAll(Long boardNum) throws Exception;
//	댓글 단일 조회
	public ReplyVO show(ReplyVO replyVO) throws Exception;
}
