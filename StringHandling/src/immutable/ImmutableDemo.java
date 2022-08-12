package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println("befor concat :"+"\ns1:"+s1+"\ns2:"+s2);
		s1 = s1.concat(s2);
		System.out.println("After concat :"+"\ns1:"+s1+"\ns2:"+s2);

	}

}
