package samuel.tian.springSecurity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("securityContext.xml");
		MyClass mc = (MyClass) ac.getBean("myClass");
		mc.executeNormalSection();
		mc.executeCriticalSection();
	}

}
