package factory_design;

public class Demo {

	public static void main(String[] args) {
		DilogFactory windoDilog = new WindowDilog();
		windoDilog.render();
		System.out.println("------");
		DilogFactory htmlDilog = new HTMLDilog();
		htmlDilog.render();

	}

}
