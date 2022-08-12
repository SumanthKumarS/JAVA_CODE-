import java.util.Scanner;

public class JoinDemo extends Thread{
	static int n,sum = 0;
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		System.out.println("sum of the first '8' numbers");
		System.out.println("enter a value");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			(jd).join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("sum of first"+JoinDemo.n+"numbers is"+JoinDemo.sum);
		long end = System.currentTimeMillis();
		
		System.out.println("Total time taken "+(end-start)/1000+" seconds");
	}
	
	public void run(){
		for(int i=1;i<=JoinDemo.n;i++) {
			JoinDemo.sum +=i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
