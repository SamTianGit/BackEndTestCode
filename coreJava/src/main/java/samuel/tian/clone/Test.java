package samuel.tian.clone;

public class Test {
	public static void main(String[] args){
		A a1=new A();  
		A a2=new A();  
		a1.name="a1";  
		int[] a={3,2,1};
		a1.array=a;
		a2=(A)a1.clone();  

		System.out.println(a1.array);  
		System.out.println(a2.array);
		
	}
}
