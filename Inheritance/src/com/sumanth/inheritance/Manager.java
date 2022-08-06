package com.sumanth.inheritance;

public class Manager extends Employee {
	String[] projects;
	double salary;
	
	public Manager(int id, String name, String dept, double salary, String[] projects,double msalary) {
		super(id, name, dept, salary);
		System.out.println("Inside manager constructor");
		this.projects = projects;
		this.salary = msalary;
		
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing "+projects);
		for(int i=0;i<projects.length;i++) {
			System.out.println(projects[i]);
		}
	}

}
