package hierp.common.domain.vo;

import org.springframework.stereotype.Component;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;

@Component
public class UserVO {
	private String userId;
	private String userPass;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + "]";
	}
	public void create(String userId, String userPass, String userName) {
	        this.userId = userId;
	        this.userPass = userPass;
	        this.userName = userName;
	    }
}



