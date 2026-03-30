package serialization_deserialization_singleton_break;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserializationSingletonBreakMain {

	public static void main(String[] args) throws Exception {
		SerializationDeserializationSingletonBreak s1 = SerializationDeserializationSingletonBreak.getInstance();
		System.out.println(s1.hashCode());
		
		//Serialization and deserialization to break the singleton object 
		SerializationDeserializationSingletonBreak s2 = SerializationDeserializationSingletonBreak.getInstance();
		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		obs.writeObject(s2);
		System.out.println("Serialization done...");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		SerializationDeserializationSingletonBreak s3 = (SerializationDeserializationSingletonBreak) ois.readObject();
		System.out.println(s3.hashCode());
	}

}
