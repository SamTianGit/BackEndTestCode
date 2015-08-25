package samuel.tian.beans;

/**
 * Immutable POJO class to hold the flight information
 * 
 * @author Samuel Tian
 *
 */
public final class Flight {
	private final String flightId;
	private final String flightGate;
	private final String destination;
	private final String flightTime;
	public Flight(String flightId, String flightGate, String destination, String flightTime) {
		super();
		this.flightId = flightId;
		this.flightGate = flightGate;
		this.destination = destination;
		this.flightTime = flightTime;
	}
	public String getFlightId() {
		return flightId;
	}
	public String getFlightGate() {
		return flightGate;
	}
	public String getDestination() {
		return destination;
	}
	public String getFlightTime() {
		return flightTime;
	}	
}
