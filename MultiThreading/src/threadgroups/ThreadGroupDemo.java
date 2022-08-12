package threadgroups;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup parent = new ThreadGroup("parent");
		System.out.println(parent.getName());
		ThreadGroup child = new ThreadGroup("child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		child.setMaxPriority(4);
		Thread t1 = new Thread(child,"thread 1");
		Thread t2 = new Thread(child,"thread 2");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t1.getPriority());
	}

}
