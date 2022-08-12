package threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		synchronized (t) {
			System.out.println("mainThread is going to wait");
			t.wait();
			System.out.println("mainThread is notified");
			System.out.println(t.total);

		}
	}

}
