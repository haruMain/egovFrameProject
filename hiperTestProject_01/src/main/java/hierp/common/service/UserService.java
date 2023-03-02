package hierp.common.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;

public interface UserService {
//	회원가입
	public void register(UserVO userVO) throws Exception;
//	로그인 처리
	public String getSelectOne(UserVO userVO, HttpSession session) throws Exception;
	
	
//	public String login(String userId, String userPass);
//	public LoginDTO login(LoginDTO loginDTO) throws Exception;
//	public UserVO login(UserVO userVO) throws Exception;
//	조회
	public UserVO show(String userId);
	
//	전체조회
	public List<UserVO> showAll();
//	로그아웃
	public void logout(HttpSession httpSession);



}
