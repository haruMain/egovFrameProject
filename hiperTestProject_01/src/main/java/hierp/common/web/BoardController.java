package hierp.common.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hierp.common.domain.vo.BoardDTO;
import hierp.common.domain.vo.BoardVO;
import hierp.common.domain.vo.ReplyVO;
import hierp.common.service.BoardService;
import hierp.common.service.ReplyService;

@Controller("BoardController")
public class BoardController {
	
	@Resource(name="BoardService")
	private BoardService boardService;
	
	@Resource(name="ReplyService")
	private ReplyService replyService;
	
//	게시글 목록
	@RequestMapping(value = "/list.do")
	public String boardList(Model model) {
		List<BoardVO> board = boardService.showAll(); 
		model.addAttribute("boards", board);
		return "boardList";
	}
	
//	게시글 등록
	@RequestMapping(value = "/create.do", method = RequestMethod.GET)
	public String getCreate() throws Exception{
		return "create";
	}
	@RequestMapping(value = "/create.do", method = RequestMethod.POST)
	public String postCreate(BoardDTO boardDTO) throws Exception {
		boardService.register(boardDTO);
		return "redirect:list.do";
	}
	
//	게시글 수정페이지로 이동
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String getUpdate(Model model, Long boardNum) {
		BoardDTO data = boardService.show(boardNum);
		model.addAttribute("data", data);
		return "update";
	}
	
//	게시글 수정 post
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String postUpdate(BoardDTO boardDTO) throws Exception {
		boardService.modify(boardDTO);
		return "redirect:list.do";
	}
	
//	게시글 상세보기
	@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
	public String boardDetail(Model model, Long boardNum) throws Exception {
		BoardDTO data = boardService.show(boardNum);
		model.addAttribute("data", data);
//		댓글조회
		List<ReplyVO> reply = null;
		reply = replyService.showAll(boardNum);
		model.addAttribute("reply", reply);
		return "detail";
	}
	
//	게시글 삭제
	@RequestMapping(value = "/remove.do", method = RequestMethod.GET)
	public String remove(Long boardNum) {
		boardService.remove(boardNum);
		return "redirect:list.do";
	}
}














