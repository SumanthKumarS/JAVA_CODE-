package stringbuffer;

public class SBDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("intial capacity "+sb.capacity());
		sb.append("all the power is within you");
		sb.append("you can do anything");
		System.out.println(sb);
		System.out.println("currenet capacity "+sb.capacity());
		
		System.out.println("charAt : "+sb.charAt(10));
		
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6));
	}

}
