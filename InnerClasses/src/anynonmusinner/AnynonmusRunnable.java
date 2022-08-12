package anynonmusinner;

public class AnynonmusRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" anosymus runnable immplementation");
			}
		});
		t.start();
	}

}
