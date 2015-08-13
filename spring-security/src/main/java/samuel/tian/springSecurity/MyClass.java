package samuel.tian.springSecurity;

public class MyClass {
	
	public void executeCriticalSection(){
		System.out.println("WARNING: This is CRITICAL section !!");
	}
	
	public void executeNormalSection(){
		System.out.println("INFO: This is normal section ..");
	}
}
