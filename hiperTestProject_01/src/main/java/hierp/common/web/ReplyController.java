package hierp.common.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hierp.common.domain.vo.ReplyVO;
import hierp.common.service.ReplyService;

//@Controller("ReplyController")
public class ReplyController {
	
	@Resource(name="ReplyService")
	private ReplyService replyService;
	
//	댓글 작성
	@RequestMapping(value = "/replyWrite.do", method = RequestMethod.POST)
	public String postWrite(ReplyVO replyVO) {
		replyService.register(replyVO);
		return "redirect:/detail.do" + replyVO.getBoardNum();
	}
}
