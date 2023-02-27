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
	public void modify(ReplyVO replyVO) {
		replyDAO.setBoardVO(replyVO);
	}

//	삭제
	@Override
	public void remove(Long replyNum) {
		replyDAO.remove(replyNum);
	}

//	조회
//	@Override
//	public ReplyVO show(Long replyNum) {
//		return replyDAO.findById(replyNum);
//	}

//	전체조회
	@Override
	public List<ReplyVO> showAll(Long boardNum) throws Exception {
		return replyDAO.findAll(boardNum);
	}
	

}
