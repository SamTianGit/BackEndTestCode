package package5;
import java.io.*;
import java.util.Date;

public class TestPrintStream3 {
	public static void main(String[] args){
		String s=null;
		BufferedReader br =new BufferedReader(
				new InputStreamReader(System.in));
		try{
			FileWriter fw =new FileWriter("C:\\Users\\Siyu Tian\\Desktop\\log.txt",true);  // true mean continue writing.
			PrintWriter log= new PrintWriter(fw);
			while((s=br.readLine())!=null) {
				if(s.equalsIgnoreCase("exit")) 
					break;
				System.out.println(s.toUpperCase());
				log.println("---------");
				log.println(s.toUpperCase());
				log.flush();	//just for case. you dont have to use flush.
			}
			log.println("==="+new Date()+"===");
			log.flush();
			log.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
