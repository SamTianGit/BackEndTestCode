package samuel.tian.classLoading;

//BootStrap classloader ������ĵ�ClassLoader�� ������������ ��࣬ cʵ�֣� ������jar��װ��JDK�ĺ����ൽ�ڴ��м䣬 �������ò�����.  �����classloader����javaд�ģ� Ҳ���Ǳ����classloader  load���ڴ��
//extension classloader װ��JDK extension��jar��
//application classloader װ�������Լ������class
public class TestJDKClassLoader {
	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(com.sun.nio.zipfs.JarFileSystemProvider.class.getClassLoader().getClass().getName());
		System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
		System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());   //which is application classLoader
	}
}
