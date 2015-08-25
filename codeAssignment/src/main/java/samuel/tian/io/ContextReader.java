package samuel.tian.io;

import java.util.List;
import java.util.Map;

import samuel.tian.utils.AirportProperty;

/**
 *  The implementation class of this interface will be responsible to read airport context from a source:
 *  All the informations of Bags, Flights and Routes
 * 
 * @author Samuel Tian
 *
 */
public interface ContextReader {
	
	/**
	 * Read the airport context from a source
	 * 
	 * @return airport context in a map format. The key will be one of {@link AirportProperty} and the
	 * value will be the corresponding concrete data.
	 * 
	 * @see AirportProperty
	 */
	public Map<AirportProperty, List<Object>> readContext();
}
