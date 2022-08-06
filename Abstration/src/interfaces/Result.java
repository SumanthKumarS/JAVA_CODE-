package interfaces;

public class Result {

	public static void main(String[] args) {
		TouchScreenLaptop hp = new HPNotebook();
		TouchScreenLaptop dell = new DellNotebook();
		hp.click();
		hp.scroll();
		dell.click();
		dell.scroll();

	}

}
