package factory_design;

public class WindowDilog extends DilogFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}
}
