package reflation_singleton_partten_break;
/**
 * In this we are breaking the singleton by using a Reflation API. 
 * Solution:
 * 1. constructor we can check if the instance is created or not
 * if created we can throw the exception.
 * 2. We can a enum 
 * */

public class ReflationApi_Singleton_break {
	
	
	private static ReflationApi_Singleton_break instance;
	
	private ReflationApi_Singleton_break() throws Exception {
		if(instance != null) {//Solution to avoid singleton to break via reflation
			throw new Exception("Trying to create new instance");
		}
	}
	public static ReflationApi_Singleton_break getInstance() throws Exception {
		if(instance == null) {
			instance = new ReflationApi_Singleton_break();
		}
		return instance;
	}
}
