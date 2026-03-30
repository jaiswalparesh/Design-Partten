package reflation_singleton_partten_break;

import java.lang.reflect.Constructor;

public class ReflationApiSingletonBreak {

	public static void main(String[] args) throws Exception {
		ReflationApi_Singleton_break rsb = ReflationApi_Singleton_break.getInstance();
		System.out.println(rsb.hashCode());
		
		//use reflation api to break singleton
		Constructor<ReflationApi_Singleton_break>dc = ReflationApi_Singleton_break.class.getDeclaredConstructor();
		dc.setAccessible(true);
		ReflationApi_Singleton_break newInstance = dc.newInstance();
		System.out.println(newInstance.hashCode());
		
	}

}
