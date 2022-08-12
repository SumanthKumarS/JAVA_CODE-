package Synchronization.deadlocks;

public class DeadLockDemo implements Runnable{
	FirstResource fr =new FirstResource();
	SecondResource sr =new SecondResource();
	
	public DeadLockDemo() {
		new Thread(this).start();
	}
	
	
	public static void main(String[] args) {
		new DeadLockDemo();
	}
	
	@Override
	public void run() {
		fr.method1(sr);
	}

}
