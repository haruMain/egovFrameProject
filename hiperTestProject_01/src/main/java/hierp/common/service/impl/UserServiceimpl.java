package hierp.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import hierp.common.domain.vo.LoginDTO;
import hierp.common.domain.vo.UserVO;
import hierp.common.service.UserService;

@Service("UserService")
public class UserServiceimpl implements UserService {
	
	@Resource(name="UserDAO")
	private UserDAO userDAO;

//	회원가입
	@Override
	public void register(UserVO userVO) {
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
	@Override
	public UserVO login(LoginDTO loginDTO) {
		return userDAO.login(loginDTO);
	}
}
