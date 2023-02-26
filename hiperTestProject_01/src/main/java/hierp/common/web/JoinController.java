package hierp.common.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JoinController {
	
	@RequestMapping(value = "/join.do")
	public String boardList(Model model) {
		return "join";
	}
	@RequestMapping(value = "/login.do")
	public String login(Model model) {
		return "login";
	}

}
