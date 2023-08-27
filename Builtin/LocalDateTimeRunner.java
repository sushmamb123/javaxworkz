package com.xwork.String;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LocalDateTimeRunner");
		LocalDateTime local = LocalDateTime.now(); 
		LocalTime ref=local.toLocalTime();
		System.out.println(ref);
		int ref1=local.compareTo(local);
		System.out.println(ref1);
		DayOfWeek ref2=local.getDayOfWeek();
		System.out.println(ref2);
		LocalDateTime ref3=local.minusHours(ref1);
		System.out.println(ref3);
		String ref4=local.toString();
		System.out.println(ref4);
		int ref5=local.getNano();
		System.out.println(ref5);
	}

}
