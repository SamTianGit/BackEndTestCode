package samuel.tian.singleton;

public class MySingleton2 {
	private MySingleton2() {
	}

	public static MySingleton2 getInstance() {
		return Inner.instance;
	}

	private static class Inner {
		static MySingleton2 instance = new MySingleton2();
	}

}
