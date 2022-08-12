package Synchronization;

public class SychronizationDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("jhon");
		MyThread t2 = new MyThread("mike");
		
		t1.start();
		t2.start();
	}

}
