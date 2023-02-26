package hierp.common.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import hierp.common.service.CommonService;

@Service("CommonService")
public class CommonServiceImpl implements CommonService {
	
	@Resource(name = "CommonDAO")
	private CommonDAO commonDAO;
	
	
	@Override
	public List<?> commonSelect(Map<String, Object> commandMap) throws Exception, SQLException {
		return commonDAO.comSelect(commandMap);
	}
	
}
