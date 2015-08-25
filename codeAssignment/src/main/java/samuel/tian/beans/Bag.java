package samuel.tian.beans;

/**
 * Immutable POJO class to hold bags' information
 * 
 * @author Siyu Tian
 *
 */

public final class Bag {
	private final String bagNumber;
	private final String entryPoint;
	private final String flightId;
	
	public Bag(String bagNumber, String entryPoint, String flightId) {
		super();
		this.bagNumber = bagNumber;
		this.entryPoint = entryPoint;
		this.flightId = flightId;
	}
	public String getBagNumber() {
		return bagNumber;
	}
	public String getEntryPoint() {
		return entryPoint;
	}
	public String getFlightId() {
		return flightId;
	}
	
}
