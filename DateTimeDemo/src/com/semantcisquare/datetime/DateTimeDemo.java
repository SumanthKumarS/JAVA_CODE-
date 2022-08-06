package com.semantcisquare.datetime;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class DateTimeDemo {
	private static void testLegacyDateAPI() {
		System.out.println("\n Date class ....");
		Date currentDate = new Date();
		System.out.println("\n Date "+currentDate);
		System.out.println("\n Time in mili sec"+currentDate.getTime());
		System.out.println("\n Calender class ....");
		Calendar expireDate = new GregorianCalendar(2017,03,15);
		System.out.println("\n Date "+expireDate.getTime());
		expireDate.roll(Calendar.MONTH,9);
		System.out.println("\n new ecpire "+expireDate.getTime());
		expireDate.roll(Calendar.MONTH,11);
		System.out.println("\n new ecpire "+expireDate.getTime());
		
		LocalDate expiryDate = LocalDate.of(2017,Month.JUNE,30);
		System.out.println("\n new ecpire "+expiryDate.getDayOfWeek());

		
	}
	
	public static void main(String[] args) {
		testLegacyDateAPI();
	}
}
