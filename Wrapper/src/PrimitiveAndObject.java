
public class PrimitiveAndObject {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		int z = y.intValue();
		System.out.println(z);

	}

}
