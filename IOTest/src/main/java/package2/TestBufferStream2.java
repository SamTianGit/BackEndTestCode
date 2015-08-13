package package2;
import java.io.*;
public class TestBufferStream2 {
	
	public static void main(String[] args){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Siyu Tian\\Desktop\\data2.txt"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Siyu Tian\\Desktop\\data2.txt"));
			String s=null;
			for(int i=1;i<=100;i++){
				s =String.valueOf(Math.random());
				bw.write(s);
				bw.newLine();
			}
			bw.flush();
			while((s=br.readLine())!=null){   //readline是BufferedReader一个很有用的方法
				System.out.println(s);
			}
			bw.close();
			br.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
