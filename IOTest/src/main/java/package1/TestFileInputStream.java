package package1;
import java.io.*;
/**
 * Test of FileInputStream . FileInputStream is reading 1 byte each read() operation, which means it cannot read chinese characters.
 * If you want to read Chinese characters, please use FileReader
 * 
 * @see TestFileReader
 * @author Siyu Tian
 *
 */
public class TestFileInputStream {
	public static void main(String[] args){
		int b=0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("C:\\Users\\Siyu Tian\\workspace\\IO\\src\\package1\\TestFileInputStream.java");
			
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
