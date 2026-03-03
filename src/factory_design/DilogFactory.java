package factory_design;

public abstract class DilogFactory {

	public abstract Button createButton();
	
	public void render() {
		Button bt = createButton();
		bt.onClick();
		bt.render();
	}
}
