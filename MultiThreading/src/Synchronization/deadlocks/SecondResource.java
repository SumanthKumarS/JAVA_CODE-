package Synchronization.deadlocks;

public class SecondResource {
	public synchronized void method1(FirstResource fr) {
		System.out.println("inside method 1 SR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("invoking fr");
		fr.method2();
	}
	public synchronized void method2() {
		System.out.println("inside method 2 SR");
		
	}
}
