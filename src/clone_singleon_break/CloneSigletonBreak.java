package clone_singleon_break;

/**
 * Cloning the object to break the singleton 
 * solution:
 * override the clone() method and return the same instance.
 * 
 * **/

public class CloneSigletonBreak implements Cloneable {

	private static CloneSigletonBreak instance;

	private CloneSigletonBreak() {
		// TODO Auto-generated constructor stub
	}

	public static CloneSigletonBreak getInstance() {
		if (instance == null) {
			instance = new CloneSigletonBreak();
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return instance;
	}
}
