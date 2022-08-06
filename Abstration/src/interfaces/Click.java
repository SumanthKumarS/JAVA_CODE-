package interfaces;

public abstract class Click {
	void option_click() {
		System.out.println("Click Option");
	}
	abstract void click();
	public static void main(String[] args) {
		System.out.println("Main of Click Option");
	}
}
