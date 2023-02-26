package hierp.common.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hierp.common.domain.vo.ReplyVO;
import hierp.common.service.ReplyService;

@Controller("ReplyController")
public class ReplyController {
	
	@Resource(name="ReplyService")
	private ReplyService replyService;
	
//	@RequestMapping(value = "/replyCreate.do", method = RequestMethod.POST)
	@PostMapping("/replyCreage.do")
	public String write(@RequestBody ReplyVO replyVO) throws Exception {
		replyService.register(replyVO);
		return "write success";
	}

}
