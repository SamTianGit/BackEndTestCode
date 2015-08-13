package package4;
import java.io.*;
/**
 * DataInputStream ��DataOutputStream �ṩ�˿��Դ�ȡ������޹ص�javaԭʼ��������(eg. int, double)�ķ���
 * ��Read/Write Boolean, Read/Write Double etc.
 * �׽���InputStream ��OutputStream ��
 * 
 * @author Siyu Tian
 *
 */
public class TestDataStream {
	public static void main(String[] args){
		ByteArrayOutputStream baos =
				new ByteArrayOutputStream();  //���ڴ����������һ���ֽ����飬��һ���Ѿ��������ӵ�OutputStream,׼��������д����   �ܵ��������ڴ�������
		DataOutputStream dos=
				new DataOutputStream(baos);
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais=
					new ByteArrayInputStream(baos.toByteArray());  // ����һ��������byteArray�ϱߵ�inputStream
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
