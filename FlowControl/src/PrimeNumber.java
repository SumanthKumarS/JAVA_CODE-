import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean primeFlag = false;
		for(int i= 2;i<=n-1;i++) {
			if(n%i == 0) {
				primeFlag = true;
				break;
			}
			else
				continue;
		}
		if(primeFlag == false)
			System.out.println("Is a Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
