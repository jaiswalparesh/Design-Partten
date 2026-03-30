package clone_singleon_break;

public class CloneSingletonBreakMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneSigletonBreak c1 = CloneSigletonBreak.getInstance();
		System.out.println(c1.hashCode());
		
		// Cloning the object to break the singleton 
		CloneSigletonBreak cloneInstance = (CloneSigletonBreak)c1.clone();
		System.out.println(cloneInstance.hashCode());

	}
}
