package samuel.tian.reflection;

import java.io.*;
import java.lang.reflect.*;
import java.util.Properties;

public class TestReflection {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("src/package1/test.properties");
		Properties p = new Properties();
		p.load(fr);
		String str = p.getProperty("class");
		System.out.println(str);
//		String str = "package1.T";
		Class c = Class.forName(str);			//load a class. return Class type
		Object obj = c.newInstance();						//new a instance of that class

		
		Method[] methods = c.getMethods();		//get all the Object representation of methods of this class
		for(Method method: methods) {
			if(method.getName().equals("m")) {
				method.invoke(obj);     // first parameter is which object calls this method, second is method parameters
			}
			//System.out.println(method.getName());
		}
		
/*		T t = new T();
		System.out.println(t.getClass().getName());*/
	}

}

class T {
	
	static {
		System.out.println("T loaded!");
	}
	
	public T() {
		System.out.println("T constructed");
	}
	
	int i;
	String s;
	public void m1(int i) {
		this.i = i;
	}
	
	public String getS() {
		return s;
	}
	
	public void m() {
		System.out.println("m invoked");
	}
}
