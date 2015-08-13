package package1;

import java.io.*;
/**
 * This class is writing unicode from 0 to 50000
 * 
 * @author Siyu Tian
 *
 */
public class TestFileWriter {
	public static void main(String[] args){
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/Users/Siyu Tian/Desktop/test.txt");
			for(int c=0;c<50000;c++){
				if(c%100 ==0)
					fw.write("\n");
				fw.write(c);
			}
			System.out.println("写入完成");
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("写入文件错误");
			System.exit(-1);
		}
	}
}
