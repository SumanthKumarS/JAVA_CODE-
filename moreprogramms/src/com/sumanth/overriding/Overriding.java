package com.sumanth.overriding;

public class Overriding {

	public static void main(String[] args) {
		Parent.doSOmthing();
		Child.doSOmthing();
		Parent p = new Parent();
		System.out.println(p.s);
		Child c = new Child();
		System.out.println(c.s);
		Parent c1 = new Child();
		System.out.println(c1.s);
	}

}
