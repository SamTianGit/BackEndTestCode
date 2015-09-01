package samuel.tian.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFilesInterfacesTest {

	public static void main(String[] args) {
		pathInfo();
	}

	public static void pathInfo() {

		Path path = Paths.get("e:\\123.txt");
		System.out.println("Number of Nodes:" + path.getNameCount());
		System.out.println("File Name:" + path.getFileName());
		System.out.println("File Root:" + path.getRoot());
		System.out.println("File Parent:" + path.getParent());
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
