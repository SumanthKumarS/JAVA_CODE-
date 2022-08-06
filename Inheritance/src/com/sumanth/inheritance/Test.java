package com.sumanth.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] {"Flight Reservation", "check in"};
		Manager manager = new Manager(1,"john","Travel",100000,projects,20000);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		Developer dev = new Developer(2,"ram","Travel",100000,"fullstack");
		System.out.println(dev.id);
		System.out.println(dev.name);
		System.out.println(dev.dept);
		System.out.println(dev.salary);
		dev.work();
	}

}
