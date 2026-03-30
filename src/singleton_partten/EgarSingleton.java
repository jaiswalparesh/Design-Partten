package singleton_partten;

public class EgarSingleton {
	
	private EgarSingleton() {}
	private static EgarSingleton instance = new EgarSingleton();
	
	public static EgarSingleton getInstance() {
		return instance;
	}
}
