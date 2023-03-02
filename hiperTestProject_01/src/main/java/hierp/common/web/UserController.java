package hierp.common.web;

import javax.annotation.Resource;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.core.Logger;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "login";
	}
//	회원가입
	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String getLogin() throws Exception{
		return "join";
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String postLogin(UserVO userVO, RedirectAttributes redirectAttributes) throws Exception {
		String hashedPw = BCrypt.hashpw(userVO.getUserPass(), BCrypt.gensalt());
		userVO.setUserPass(hashedPw);
		userService.register(userVO);
		redirectAttributes.addFlashAttribute("msg", "REGISTERED");
		return "redirect:/user.do";
	}
	
//	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
//	public String postLogin(UserVO userVO) throws Exception {
//		userService.register(userVO);
//		return "login";
//	}
//	 로그인 페이지
	 @RequestMapping(value = "/login.do", method = RequestMethod.GET)
	 public String loginGET(@ModelAttribute("loginDTO") LoginDTO loginDTO) {
		 return "login";
	 }
	 
	 @RequestMapping(value = "/login.do", method = RequestMethod.POST)
	 public String login(LoginDTO loginDTO, RedirectAttributes redirect, HttpServletRequest request) throws Exception {
		 System.out.println("login() controller 들어옴");
		 LoginDTO result = userService.login(loginDTO);
		 if(result !=null) {
			 HttpSession sesstion = request.getSession();
			 sesstion.setAttribute("user", result);
			 System.out.println("로그인 정보");
			 return "redirect:/list.do";
		 }
		 else {
			 redirect.addFlashAttribute("msg", "로그인 실패");
			 return "redirect: /user.do";
		 }
	 }
	 
	 
//	 @RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	 public String login(UserVO userVO, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
//		 HttpSession sesstion = req.getSession();
//		 UserVO login = userService.login(userVO);
//		 
//		 if(login == null) {
//			 sesstion.setAttribute("user", null);
//			 rttr.addFlashAttribute("msg", false);
//		 }else {
//			 sesstion.setAttribute("user", login);
//		 }
//		 return "redirect:/list.do";
//	 }
	 
	 
	 
	 
	 
//	 @RequestMapping(value = "/loginPost.do", method = RequestMethod.POST)
//	 public String postLogin(UserVO userVO, HttpServletRequest request) {
//		 LoginDTO login = userService.login(userVO);
//		 HttpSession sesstion = request.getSession();
//		 
//	 }
	 
//	 @RequestMapping(value = "/loginPost.do", method = RequestMethod.POST)
//	 public void loginPost(LoginDTO loginDTO, Model model, HttpSession httpSession) throws Exception {
//		 UserVO userVO = userService.login(loginDTO);
//		 
//		 if(userVO==null || !BCrypt.checkpw(loginDTO.getUserPass(), userVO.getUserPass())) {
//			 return;
//		 }
//		 model.addAttribute("user", userVO);
//	 }
	 
//	 로그인 처리
//	 public ModelAndView login(@ModelAttribute LoginDTO loginDTO, HttpSession httpSession) {
//	  String name = userService.login(loginDTO, httpSession);  
//	  ModelAndView mav = new ModelAndView();
//	  //	  로그인 성공
//	   if (name != null) { 
//	    mav.setViewName("home"); // 뷰의 이름
//	    } else { // 로그인 실패 시
//	      mav.setViewName("/list.do"); 		
//	      mav.addObject("message", "error");
//	      }
//	      return mav;
//	    }
	 
	
	
//	 url경로 Test
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
//		List<UserVO> user = userService.showAll(); 
//		model.addAttribute("users", user);
		
		return "Test";
	}

}
