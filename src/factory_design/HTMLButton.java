package factory_design;

public class HTMLButton implements Button {

	
	public void render() {
		System.out.println("render the HTML page");
		
	}

	public void onClick() {
		System.out.println("HTML click event is trigger");
		
	}

}
