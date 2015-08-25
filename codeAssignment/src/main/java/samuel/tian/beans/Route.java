package samuel.tian.beans;

/**
 * Immutable POJO class to hold the Route information
 * 
 * @author Samuel Tian
 *
 */
public final class Route {
	private final String node1;
	private final String node2;
	private final int travelTime;
	
	public Route(String node1, String node2, int travelTime){
		this.node1 = node1;
		this.node2 = node2;
		this.travelTime = travelTime;
	}

	public String getNode1() {
		return node1;
	}

	public String getNode2() {
		return node2;
	}

	public int getTravelTime() {
		return travelTime;
	}
	
}
