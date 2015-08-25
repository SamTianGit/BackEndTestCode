package samuel.tian.algorithm;

import java.util.List;
import samuel.tian.beans.Route;

public interface ShortestPathFinder {

	public ResultSet findPath(List<Route> routes, String startNode, String endNode);
	
	class ResultSet {
		
	}
}
