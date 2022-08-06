package moreInheitanceConcepts;

public class SuperClass {
	int x;
	public SuperClass() {
		System.out.println("no arg Super class constructor");
	}
	public SuperClass(int x) {
		this();
		this.x =x;
		System.out.println("one arg Super class constructor");
	}
}
