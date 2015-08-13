package package1;
import java.io.*;
/**
 * Test of FileReader. FileReader is reading a char (2 bytes) each time, which means it can read chinese characters from a file.
 * 
 * @author Siyu Tian
 *
 */
public class TestFileReader {
	public static void main(String[] args){
		int b=0;
		FileReader in = null;
		try{
			in = new FileReader("C:\\Users\\Siyu Tian\\workspace\\IO\\src\\package1\\TestFileReader.java");
			
		} catch (FileNotFoundException e){
			 System.out.println("找不到指定文件");
			 System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b=in.read()) != -1){
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println("Have read totally " + num+ " bytes.");
		} catch (IOException e) {
			System.out.println(" Reading file exception.");
			System.exit(-1);
		}
		
	}
}
