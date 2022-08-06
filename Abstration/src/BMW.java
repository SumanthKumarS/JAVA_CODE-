//marking abstract class as final it can either be abstract or finalso it cannot mark abstract class as final
//we cannot mark abstract method as static
//
public abstract class BMW {
	//modifier abstract
	void commonFunc() {
		System.out.println("inside Common functionality");
	}
	//abstract keyword or abstract methods
	abstract void accelerate();
	
	// main method inside abstract class;
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
}
