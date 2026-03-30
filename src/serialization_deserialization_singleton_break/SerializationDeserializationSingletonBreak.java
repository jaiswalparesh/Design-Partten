package serialization_deserialization_singleton_break;

import java.io.Serializable;

/**
 * We can do Serialization and deserialization to break the singleton object
 * solution :
 * create a method name as readResolve() and return the same instance 
 * 
 * 
 * **/

public class SerializationDeserializationSingletonBreak implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SerializationDeserializationSingletonBreak instance;
	
	private SerializationDeserializationSingletonBreak() {
		// TODO Auto-generated constructor stub
	}
	
	public static SerializationDeserializationSingletonBreak getInstance() {
		if(instance == null) {
			instance = new SerializationDeserializationSingletonBreak();
		}
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}
}
