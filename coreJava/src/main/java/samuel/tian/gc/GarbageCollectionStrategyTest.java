package samuel.tian.gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GarbageCollectionStrategyTest {

	public static void main(String[] args) {
		List<GarbageCollectorMXBean> gcs =
				  ManagementFactory.getGarbageCollectorMXBeans();
				for (GarbageCollectorMXBean gc : gcs) {
				  System.out.println(gc.getName());
				}
	}

}
