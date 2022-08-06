
public class ObjectAndString {

	public static void main(String[] args) {
		long x = 1000;
		Long y = Long.valueOf(x);
		String s = y.toString();
		System.out.println(s);
		Long z = Long.valueOf(s);
		System.out.println(z);

	}

}
