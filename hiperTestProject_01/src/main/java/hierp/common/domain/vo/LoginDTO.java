package hierp.common.domain.vo;

public class LoginDTO {
	
	private String userId;
	private String userPass;
	private boolean userCookie;
	
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
	public boolean isUserCookie() {
		return userCookie;
	}
	public void setUserCookie(boolean userCookie) {
		this.userCookie = userCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [userId=" + userId + ", userPass=" + userPass + ", userCookie=" + userCookie + "]";
	}

}
