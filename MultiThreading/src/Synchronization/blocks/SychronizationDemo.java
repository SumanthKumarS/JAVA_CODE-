package Synchronization.blocks;

//import Synchronization.classlock.DisplayMessage;
//import Synchronization.classlock.MyThread;

public class SychronizationDemo {

	public static void main(String[] args) {
		
DisplayMessage dm = new DisplayMessage();
		
		MyThread t1 = new MyThread(dm, "jhon");
		MyThread t2 = new MyThread(dm, "mike");
		
		t1.start();
		t2.start();
	}

}
