import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		System.out.println("Enter the number:\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
}
