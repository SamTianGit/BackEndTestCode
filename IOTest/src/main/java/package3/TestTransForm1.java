package package3;
import java.io.*;


// InputStreamReader 和OutputStreamWriter是转换流，可以将字节流转换为字符流,就可以使用字符流的方法， 如write(str)
public class TestTransForm1 {
	public static void main(String[] args){
		try{
			
			OutputStreamWriter osw=new OutputStreamWriter(
					new FileOutputStream("C:\\Users\\Siyu Tian\\Desktop\\data3.txt"));
			osw.write("Microsoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
			osw =new OutputStreamWriter(
					new FileOutputStream("C:\\Users\\Siyu Tian\\Desktop\\data3.txt",true),"ISO8859_1");  // true means continue writing from the end of the file, false will erase the file and then write
			// ISO8859_1 包含所有西欧语言
			osw.write("Microsoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
