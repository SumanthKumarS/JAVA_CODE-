package staticinner;

public class Outer {
	static void f1() {
		System.out.println("outer static method");
	}

	static class Inner{
		static void f2() {
			System.out.println("inner static method");
		}
		void f3() {
			System.out.println("non static inner method");
		}
	}
	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();
		Outer.Inner in = new Outer.Inner();
		in.f3();
	}

}
