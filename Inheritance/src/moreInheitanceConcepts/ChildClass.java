package moreInheitanceConcepts;

public class ChildClass extends SuperClass {
	ChildClass(){
		this(10);
		System.out.println("no arg childClass Constructor");
	}
	ChildClass(int x){
		super(x);
		System.out.println("one arg childClass Constructor");
	}
	public static void main(String[] arg) {
		ChildClass c = new ChildClass();
		
	}
}
