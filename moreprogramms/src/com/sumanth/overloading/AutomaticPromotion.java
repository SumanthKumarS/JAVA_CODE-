package com.sumanth.overloading;

public class AutomaticPromotion {

	public void print(int i) {
		System.out.println("integer version : "+i);
	}
//	public void print(char i) {
//		System.out.println("integer version : "+i);
//	}
//	public void print(Long i) {
//		System.out.println("integer version : "+i);
//	}
	public void print(float f) {
		System.out.println("float version : "+f);
	}
	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(123);
		ap.print(10.5f);
	}

}
