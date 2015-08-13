package samuel.tian.classLoading;


/**
 * Every classLoader has a reference of another classLoader named "parent". when a class is loaded by classLoader. classCloader will look for its parent to see
 * if this class has been loaded. if so, this class will not be loaded again. if not, this class will by loaded by this class loader,
 * which would probably prevent destructive code
 * 
 * @author Siyu Tian
 *
 */
public class TestClassLoaderRelation {

	public static void main(String[] args) {
		ClassLoader c = TestClassLoaderRelation.class.getClassLoader();
		while(c != null) {
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
	}
}
