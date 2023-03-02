package hierp.common.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hierp.common.domain.vo.UserVO;
import hierp.common.service.UserService;

@Controller("UserController")
public class UserController {
	
	@Resource(name="UserService")
	private UserService userService;
	
//	첫 화면
	@RequestMapping(value = "/user.do")
	public String select(Model model) {
		return "login";
	}
//	회원가입
//	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	@GetMapping("/join.do")
	public String getLogin() throws Exception{
		return "join";
	}
	
	@RequestMapping(value = "/login_check.do", method = RequestMethod.GET)
	 public String login() {
	  return "/login";
	}
	
//	로그인 처리
	@RequestMapping(value = "/login_check.do", method = RequestMethod.POST)
	public ModelAndView login_check(@ModelAttribute UserVO userVO, HttpSession session) throws Exception {
	 String userName = userService.getSelectOne(userVO, session);
	 ModelAndView mav = new ModelAndView();
//	 로그인 성공
	  if (userName != null) { 
	   mav.setViewName("/list.do"); 
	   System.out.println("로그인 성공");
//	   로그인 실패
	   } else { 
	     mav.setViewName("redirect:/login.do"); 		
	     mav.addObject("message", "error");
	     System.out.println("로그인 실패");
	     }
	     return mav;
	   }
}
