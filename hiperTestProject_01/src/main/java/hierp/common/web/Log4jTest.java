package hierp.common.web;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import hierp.common.service.UserService;

public class Log4jTest {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4jTest.class.getName());
		
		logger.trace("trace - master 로그인");	
		logger.debug("debug - master 로그인");	
		logger.info("info - master 로그인");	
		logger.warn("warn - master 로그인");	
		logger.error("error - master 로그인");	
		
//		logger.info(jdbc.resultSettable);
	}
	/*static Logger logger = Logger.getLogger("log4jtest.LogTest");
	
	public static void loginCheck(String id) {
		if(id.equals("master")){  
			logger.trace("trace - master 로그인");	
			logger.debug("debug - master 로그인");	
			logger.info("info - master 로그인");	
			logger.warn("warn - master 로그인");	
			logger.error("error - master 로그인");		
		}else {
			logger.warn("warn - user가 잘못 입력");
		}
	}


public static void main(String[] args) {
	
		loginCheck("master");
	}
*/
}