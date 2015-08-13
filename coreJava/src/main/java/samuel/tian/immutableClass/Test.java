package samuel.tian.immutableClass;

public class Test {
	public static void main(String[] args){
		Person p=new Person("Siyu Tian");
		System.out.println(p);
		p=p.addPrefix("Mr");
		System.out.println(p);
		
	}
}
