package singleton;

public class EagerSingleton {
	private static EagerSingleton es = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getSingleton() {
		return es;
	}

}
