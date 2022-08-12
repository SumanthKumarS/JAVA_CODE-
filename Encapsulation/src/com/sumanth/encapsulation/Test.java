package com.sumanth.encapsulation;

public class Test {

	public static void main(String[] args) {
		Paitent p = new Paitent();
		p.setId(123);
		p.setName("ram");
		p.setSsn("123p");
		System.out.println("id " +p.getId());
		System.out.println("name " +p.getName());
		System.out.println("SSN " +p.getSsn());
	}
	

}
