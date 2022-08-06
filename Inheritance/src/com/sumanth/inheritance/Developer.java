package com.sumanth.inheritance;

public class Developer extends Employee {
	String technology;
	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		System.out.println("Inside developer constructor");
		this.technology = technology;
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("developer is managing "+technology);
	}


}
