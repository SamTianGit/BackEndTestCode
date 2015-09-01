package samuel.tian.java7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author Siyu Tian
 *
 */
public class NewFeatureTest {

	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>(); // Diamond operator
		int million  =  1_000_000; // numeric literals with underscores
		try {   //improved exception handling//improved exception handling
			Thread.sleep(200);
		} catch(RuntimeException | InterruptedException e2){
			// log the exception
		}
	}

	// auto-closeable
	public void autoCloseableTest() {
		try (FileOutputStream fos = new FileOutputStream("movies.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Java 7 Block Buster");
		} catch (IOException e) {
			// log the exception

		}

	}
}
