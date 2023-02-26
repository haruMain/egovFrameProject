package hierp.common.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CommonService {
	
	public List<?> commonSelect(Map<String, Object> commandMap) throws Exception, SQLException;
	
}
