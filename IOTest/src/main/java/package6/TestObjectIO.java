package package6;

import java.io.*;

/**
 * Object stream
 * transient  Serializable keyword
 * 
 * @author Siyu Tian
 *
 */
public class TestObjectIO {
	public static void main(String[] args) throws Exception{
		T t =new T();
		t.k = 8;
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Siyu Tian\\Desktop\\testObjectIO.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Siyu Tian\\Desktop\\testObjectIO.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T)ois.readObject();
		System.out.println(tReaded);
	}
}

class T implements Serializable			//给类打个标记，给编译器看，说明可以序列化
{
	int i = 10;
	int j = 9;
	double d = 2.3;
	transient 		//field modified by transient keyword will not be serialized
	int k = 15;
	public String toString(){
		return i+" "+j+" "+d+" "+k;
	}
}
