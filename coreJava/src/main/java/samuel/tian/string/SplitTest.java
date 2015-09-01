package samuel.tian.string;

public class SplitTest {
	public static void main(String[] args){
		String str = ";a;b;c";
		String[] strs = str.split(";");
		System.out.println(strs.length);
		for(int i = 0 ; i< strs.length ; i++){
			System.out.println(strs[i]);
		}
		
	}
}
