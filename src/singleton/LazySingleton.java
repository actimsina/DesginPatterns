package singleton;

public class LazySingleton {
	private static LazySingleton ls;

	private LazySingleton() {

	}

	public static LazySingleton getSingleton() {
		if (ls == null)
			ls = new LazySingleton();
		return ls;
	}
}
