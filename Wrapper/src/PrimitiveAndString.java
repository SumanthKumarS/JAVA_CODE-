
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x = 100;
		System.out.println(x);
		String y = Byte.toString(x);
		System.out.println(y);
		byte z = Byte.parseByte(y);
		System.out.println(z);

	}

}
