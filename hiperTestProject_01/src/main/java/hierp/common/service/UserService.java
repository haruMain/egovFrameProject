package hierp.common.service;

import java.util.List;

import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;

public interface UserService {
//	회원가입
	public void register(UserVO userVO);
	
//	조회
	public UserVO show(String userId);
	
//	전체조회
	public List<UserVO> showAll();
	
//	로그인 처리
	public UserVO login(LoginDTO loginDTO);

}
