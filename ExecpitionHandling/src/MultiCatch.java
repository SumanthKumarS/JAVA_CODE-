
public class MultiCatch {

	public static void main(String[] args) {
		try {
		String input = args[0];
		System.out.println("input is : "+input);
		int output = Integer.parseInt(input);
		System.out.println("output is : "+output);
		System.out.println("More code in it");
		}
		catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("input is required");
		}
		catch(NumberFormatException ne) {
			System.out.println("invalid input provided");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("More code in it");
	}

}
