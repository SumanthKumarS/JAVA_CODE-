package moreprogramms;

public class SwitchCase {

	public static void main(String[] args) {
		int a=10;
		final int b =20;//makes the satements as constant
		switch(a) {
		case 10:
			System.out.println("case 10");
			break;
		case b+1:
			System.out.println("case 20");
			break;
		case 30:
			System.out.println("case 30");
			break;
		default:
			System.out.println("No matches");
			break;
		}
	}

}
