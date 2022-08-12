package interupt;

public class MyThread extends Thread {
	public void run() {
		try {
			for (int i =1;i<=10;i++) {
				System.out.println("I am a lezy thread");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("Got interupted");
		}
	}
}
