package threadgroups;

public class ThreadGroupMethod {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mtg = new ThreadGroup("My thread group");
		
		CustomThread t1 = new CustomThread(mtg, "Thread 1");
		CustomThread t2 = new CustomThread(mtg, "Thread 2");
		CustomThread t3 = new CustomThread(mtg, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(mtg.activeCount());
		mtg.list();
		Thread.sleep(5000);
		System.out.println(mtg.activeCount());
		mtg.list();
	}
	

}
