package yeild;

public class YeildDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main Thread");
		}
	}

}
