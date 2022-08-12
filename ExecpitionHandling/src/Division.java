import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c ;
		try {
			System.out.println("enter two integers");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println("Result is" + c);
			
		}
		catch(ArithmeticException ec) {
			System.out.println("0 by execption");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("more code can go here");
	}

}
