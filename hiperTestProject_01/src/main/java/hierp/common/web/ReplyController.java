package hierp.common.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import hierp.common.domain.vo.ReplyVO;
import hierp.common.service.ReplyService;

@Controller("ReplyController")
public class ReplyController {
	
	@Resource(name="ReplyService")
	private ReplyService replyService;
	
//	댓글 작성
	@RequestMapping(value = "/replyWrite.do", method = RequestMethod.POST)
	public String postWrite(ReplyVO replyVO) {
		replyService.register(replyVO);
		return "redirect:/detail.do?boardNum=" + replyVO.getBoardNum();
	}
	
//	 댓글 단일 조회 (수정 페이지)
	@RequestMapping(value = "/modify.do", method = RequestMethod.GET)
	public String getMofidy(@RequestParam("boardNum") Long boardNum, @RequestParam("replyNum") Long replyNum, Model model) throws Exception {
		ReplyVO replyVO = new ReplyVO();
		replyVO.setBoardNum(boardNum);
		replyVO.setReplyNum(replyNum);
		ReplyVO reply = replyService.show(replyVO);
		model.addAttribute("reply", reply);
		return "/reply/modify";
	}
	
//	댓글 수정
	@RequestMapping(value = "/modify.do", method = RequestMethod.POST)
	public String postModify(ReplyVO replyVO, Model model) throws Exception {
		replyService.modify(replyVO);
		return "redirect:/detail.do?boardNum=" + replyVO.getBoardNum();
	}
	
//	댓글 삭제
	@RequestMapping(value = "/replyDelete.do", method = RequestMethod.GET)
	public String replyDelete(@RequestParam("replyNum") Long replyNum, ReplyVO replyVO) throws Exception {
		replyService.remove(replyNum);
		return "redirect:detail.do?boardNum=" + replyVO.getBoardNum();
	}
	
}







