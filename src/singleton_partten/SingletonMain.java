package singleton_partten;

public class SingletonMain {

	public static void main(String[] args) {
		LazySingleton ls1 = LazySingleton.getInstance();
		System.out.println("Lazy singleton obj1 : " + ls1.hashCode());

		LazySingleton ls2 = LazySingleton.getInstance();
		System.out.println("Lazy singleton obj2 : " + ls2.hashCode());
		
		EgarSingleton es1 = EgarSingleton.getInstance();
		System.out.println("Egar singleton obj1 : " + es1.hashCode());
		
		EgarSingleton es2 = EgarSingleton.getInstance();
		System.out.println("Egar singleton obj2 : " + es2.hashCode());
	}

}
