package finalconcepts;

public class A {
	// marking a final key as static 
	final static float pi =3.14f;
//	A(){
//		pi=3.14f;
//	}
	final public void displayValue() {
		System.out.println(A.pi);
	}
	public static void main(String[] args) {
		final A a1 = new A();
		System.out.println(a1.pi);
//		a1.pi = 3.25f;
//		a1 = new A();
	}
}
