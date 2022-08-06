package moreInheitanceConcepts;

public class Child extends Parent {
	int c,d;
	Child(int a,int b, int c,int d){
		super(a, b);
		this.c = c;
		this.d = d;
	}
	void displayDetails() {
		System.out.println("parents a"+super.a);
		System.out.println("parents b"+super.b);
		System.out.println("child c"+c);
		System.out.println("child d"+d);
	}
	void f1() {
		super.f1();
//		System.out.println(this);
		System.out.println("Inside child f1 method");
	}
}
