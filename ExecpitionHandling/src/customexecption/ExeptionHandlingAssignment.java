package customexecption;

public class ExeptionHandlingAssignment {
//	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(2000);
//	}
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println("Execption due to thred sleep Inturption");
			throw new MyThreadExeption("Exeption handled");
		}
	}
}
