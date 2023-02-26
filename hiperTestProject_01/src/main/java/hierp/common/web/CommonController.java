
package hierp.common.web;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hierp.common.service.CommonService;


@Controller("CommonController")
public class CommonController {
	
	@Resource(name = "CommonService")
	private CommonService commonService;

	@RequestMapping(value = "/test.do") 
	public String select(ModelMap model, HttpServletRequest request, HttpServletResponse response, @RequestParam Map commandMap) throws Exception, SQLException {

		//List<?> testList = commonService.commonSelect(commandMap);
		
		//model.addAttribute("testList",testList);
		
		return "Test";
	}
} 