package hierp.common.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;
import hierp.common.service.UserService;

@Service("UserService")
public class UserServiceimpl implements UserService {
	
	@Resource(name="UserDAO")
	private UserDAO userDAO;

//	회원가입
	@Override
	public void register(UserVO userVO) throws Exception {
		userDAO.save(userVO);
	}
	
//	회원조회
	@Override
	public UserVO show(String userId) {
		return null;
	}

//	회원전체조회
	@Override
	public List<UserVO> showAll() {
		return userDAO.findAll();
	}

//	로그인 처리
//	@Override
//	public String login(LoginDTO loginDTO) {
//		return userDAO.login(loginDTO);
//	}
//	@Override
//	public UserVO login(UserVO userVO) throws Exception {
//		return userDAO.login(userVO);
//	}
	@Override
	public LoginDTO login(LoginDTO loginDTO) throws Exception {
		return userDAO.login(loginDTO);
	}
	
//	@Override
//	public LoginDTO login(LoginDTO loginDTO, HttpSession httpSession) throws Exception {
//		UserVO name = userDAO.login(loginDTO);
//		if (name != null) { // 세션 변수 저장
//			httpSession.setAttribute("userId", loginDTO.getUserId());
//			httpSession.setAttribute("userName", name);
//		}
//		return name;
//	}
	

//	로그아웃
	@Override
	public void logout(HttpSession httpSession) {
		httpSession.invalidate();
	}


	
}