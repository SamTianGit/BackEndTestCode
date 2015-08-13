package samuel.tian.springSecurity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("securityContext.xml");
		SecurityContext sc = SecurityContextHolder.getContext();
		Authentication au = new UsernamePasswordAuthenticationToken("sam","sam");
		sc.setAuthentication(au);
		MyClass mc = (MyClass) ac.getBean("myClass");
		mc.executeCriticalSection();
		mc.executeNormalSection();
	}

}
