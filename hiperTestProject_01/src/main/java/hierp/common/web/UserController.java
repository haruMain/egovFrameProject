package hierp.common.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;
import hierp.common.service.UserService;

@Controller("UserController")
public class UserController {
	
	@Resource(name="UserService")
	private UserService userService;
	
//	첫 화면
	@RequestMapping(value = "/user.do")
	public String select(Model model) {
//		List<UserVO> user = userService.showAll(); 
//		model.addAttribute("users", user);
		return "login";
	}
//	회원가입
	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String getLogin() throws Exception{
		return "join";
	}
//	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
//	public String postLogin(UserVO userVO) throws Exception {
//		userService.register(userVO);
//		return "login";
//	}
	 @RequestMapping(value = "/join.do", method = RequestMethod.POST)
	    public String postLogin(UserVO userVO, RedirectAttributes redirectAttributes) throws Exception {
	        String hashedPw = BCrypt.hashpw(userVO.getUserPass(), BCrypt.gensalt());
	        userVO.setUserPass(hashedPw);
	        userService.register(userVO);
	        redirectAttributes.addFlashAttribute("msg", "REGISTERED");
	        return "redirect:/user.do";
	    }
	 
//	 로그인 처리
	 @RequestMapping(value = "/loginPost.do", method = RequestMethod.POST)
	 public void loginPost(LoginDTO loginDTO, Model model, HttpSession httpSession) throws Exception {
		 UserVO userVO = userService.login(loginDTO);
		 if(userVO==null || !BCrypt.checkpw(loginDTO.getUserPass(), userVO.getUserPass())) {
			 return;
		 }
		 model.addAttribute("user", userVO);
	 }
	
	
//	 url경로 Test
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
//		List<UserVO> user = userService.showAll(); 
//		model.addAttribute("users", user);
		
		return "Test";
	}

}
