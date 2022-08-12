package daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThreas t = new MyThreas();
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
	}

}
