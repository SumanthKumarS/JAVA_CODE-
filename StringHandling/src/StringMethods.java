
public class StringMethods {

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println("length of the string s: "+s.length());
		System.out.println("index of o : "+s.indexOf('o'));
		System.out.println("charAt of o : "+s.charAt(3));
		
		System.out.println("Substring with begining: "+s.substring(2));
		System.out.println("Substring with begining and Ending: "+s.substring(2, 4));
		
		String[] result = s.split(" ");
		for(int i=1;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("replace method"+s.replace('l', 'k'));
		System.out.println("to upper case method"+s.toUpperCase());
		System.out.println("to lower case method"+s.toLowerCase());
		
	}

}
