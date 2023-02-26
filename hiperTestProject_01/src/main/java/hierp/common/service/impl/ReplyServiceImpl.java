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

	@Override
	public void register(ReplyVO replyVO) {
		replyDAO.save(replyVO);
	}

	@Override
	public void modify(ReplyVO replyVO) {
		replyDAO.setBoardVO(replyVO);
	}

	@Override
	public void remove(Long replyNum) {
		replyDAO.remove(replyNum);
	}

	@Override
	public ReplyVO show(Long replyNum) {
		return replyDAO.findById(replyNum);
	}

	@Override
	public List<ReplyVO> showAll() {
		return replyDAO.findAll();
	}
	

}
