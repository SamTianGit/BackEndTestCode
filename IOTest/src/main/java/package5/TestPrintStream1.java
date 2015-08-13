package package5;
import java.io.*;


/**
 * PrintStream 也是处理流,不会抛出异常， 包在OutputSream 上
 * @author Siyu Tian
 *
 */
public class TestPrintStream1 {
	public static void main(String[] args){
		PrintStream ps =null;
		try{
			FileOutputStream fos =
					new FileOutputStream("C:\\Users\\Siyu Tian\\Desktop\\log.txt");
			ps = new PrintStream(fos);
		} catch (IOException e){
			e.printStackTrace();
		}
		if(ps != null)
			System.setOut(ps);
		int in=0;
		for (char c=0 ; c<=60000; c++){
			System.out.print(c+" ");
			if(in++>=100) {
				System.out.println();
				in = 0;
			}
		}
/*		for( int i=1; i<2014;i++) {
			System.out.println("ALTER ALL 'am"+i+"'am"+ (i+1) +"'");
			System.out.println("GO");
		}*/
	}
}
