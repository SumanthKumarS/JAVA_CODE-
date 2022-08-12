package Synchronization.deadlocks;

public class FirstResource {
	public synchronized void method1(SecondResource sr) {
		System.out.println("inside method 1 FR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("invoking sr");
		sr.method2();
	}
	public synchronized void method2() {
		System.out.println("inside method 2 FR");
		
	}
}
