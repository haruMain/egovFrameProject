package hierp.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import hierp.common.domain.vo.UserVO;
import hierp.common.service.UserService;

@Service("UserService")
public class UserServiceimpl implements UserService {
	
	@Resource(name="UserDAO")
	private UserDAO userDAO;

	@Override
	public void register(UserVO userVO) {
		userDAO.save(userVO);
	}
	
	@Override
	public UserVO show(String userId) {
		return null;
	}

	@Override
	public List<UserVO> showAll() {
		return userDAO.findAll();
	}


	/*
	 * @Override public void register(UserVO userVO) { userDAO.save(userVO); }
	 * 
	 * @Override public UserVO show(Long userNumber) { return
	 * userDAO.findById(userNumber); }
	 * 
	 * @Override public List<UserVO> showAll() { return userDAO.findAll(); }
	 */
	

}
