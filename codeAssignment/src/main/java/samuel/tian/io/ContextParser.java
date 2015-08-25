package samuel.tian.io;

import java.util.List;
import java.util.Map;

import samuel.tian.utils.AirportProperty;

public interface ContextParser {
	
	public Map<AirportProperty, List<Object>>  parseContext(String context);
	
}
