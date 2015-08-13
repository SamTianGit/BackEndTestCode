package package4;
import java.io.*;
/**
 * DataInputStream 和DataOutputStream 提供了可以存取与机器无关的java原始类型数据(eg. int, double)的方法
 * 如Read/Write Boolean, Read/Write Double etc.
 * 套接在InputStream 和OutputStream 上
 * 
 * @author Siyu Tian
 *
 */
public class TestDataStream {
	public static void main(String[] args){
		ByteArrayOutputStream baos =
				new ByteArrayOutputStream();  //在内存里面分配了一个字节数组，和一个已经和它连接的OutputStream,准备向里面写数据   管道连接在内存数组上
		DataOutputStream dos=
				new DataOutputStream(baos);
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais=
					new ByteArrayInputStream(baos.toByteArray());  // 创建一个连接在byteArray上边的inputStream
			System.out.println(bais.available());
			DataInputStream dis =new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			dos.close();
			dis.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
