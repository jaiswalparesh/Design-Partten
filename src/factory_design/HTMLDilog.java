package factory_design;

public class HTMLDilog extends DilogFactory {

	@Override
	public Button createButton() {
		return new HTMLButton();
	}

}
