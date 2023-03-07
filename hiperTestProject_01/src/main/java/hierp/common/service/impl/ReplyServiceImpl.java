package hierp.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hierp.common.domain.vo.ReplyVO;
import hierp.common.service.ReplyService;

@Service("ReplyService")
public class ReplyServiceImpl implements ReplyService {
	@Resource(name="ReplyDAO")
	private ReplyDAO replyDAO;

//	추가
	@Override
	public void register(ReplyVO replyVO) {
		replyDAO.save(replyVO);
	}

//	수정
	@Override
	public void modify(ReplyVO replyVO) throws Exception {
		replyDAO.modify(replyVO);
	}

//	삭제
	@Override
	public void remove(Long replyNum) throws Exception {
		replyDAO.remove(replyNum);
	}

//	전체조회
	@Override
	public List<ReplyVO> showAll(Long boardNum) throws Exception {
		return replyDAO.findAll(boardNum);
	}

//	댓글 단일 조회
	@Override
	public ReplyVO show(ReplyVO replyVO) throws Exception {
		return replyDAO.replySelect(replyVO);
	}
	

}
