package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		Organizer organize = new Organizer();
		organize.setId(12356L);
		organize.setName("Ram");
		System.out.println(organize);
		System.out.println(organize.getName());
		
		Event event = new Event(4567,"IPhone 100 Launch","grand Launch");
		System.out.println(event.getDescription());
		

	}

}
