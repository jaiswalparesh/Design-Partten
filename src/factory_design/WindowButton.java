package factory_design;

public class WindowButton implements Button {

	public void render() {
		System.out.println("render the window page");

	}

	public void onClick() {
		System.out.println("Window click event is trigger");

	}

}
