package mostwanted;

public class StackOverFlow {

	public static void method1() {
		System.out.println("method1");
		method2();
	}
	public static void method2() {
		System.out.println("method1");
		method2();
	}
	public static void main(String[] args) {
		method1();
	}

}