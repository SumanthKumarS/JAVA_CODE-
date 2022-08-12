package threadgroups;

public class Test {

	public static void main(String[] args) {
		EvenNumberThread ev = new EvenNumberThread();
		Thread t1 = new Thread(ev);
		t1.start();
		OddNumberThread od = new OddNumberThread();
		Thread t2 = new Thread(od);
		t2.start();
		for(int i =1;i<=10;i++) {
				System.out.println(i);
		}
	}

}
