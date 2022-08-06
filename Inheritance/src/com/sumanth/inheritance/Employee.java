package com.sumanth.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		System.out.println("Inside employee constructor");

	}
	
	protected void work() {
		System.out.println("common work for everyone");
	}
}
