package com.sumanth.interfaces;

public class MyCircle implements Circle,Circle2 {

	public static void main(String[] args) {
		System.out.println(Circle.pi);
	}
	
	@Override
	public void calculateArea() {
		System.out.println(Circle.pi);
		
	}

	
}
