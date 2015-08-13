package package1;

import java.io.*;

public class TestFileOutputStream {
	public static void main(String[] args){
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\Siyu Tian\\workspace\\IO\\src\\package1\\TestFileOutputStream.java");
			out = new FileOutputStream("C:/Users/Siyu Tian/Desktop/test.txt");
			while((b = in.read()) != -1){
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e){
			System.out.println("Cannot find specified file!");
			System.exit(-1);
		} catch (IOException e){
			System.out.println("Copy file aborted!");
			System.exit(-1);
		}
		System.out.println("Copy file finished");
	}
}
