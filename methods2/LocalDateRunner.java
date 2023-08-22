package com.sush.method.runner;

import java.time.LocalDate;

public class LocalDateRunner {

	public static void main(String[] args) {
		LocalDate localDate;
		LocalDate ref = LocalDate.now();
		System.out.println(ref);
		LocalDate ref2 = LocalDate.ofEpochDay(2);
		System.out.println(ref2);
		LocalDate ref3 = LocalDate.ofYearDay(6, 5);
		System.out.println(ref3);
		LocalDate ref4 = LocalDate.ofEpochDay(4);
		System.out.println(ref4);
		LocalDate ref5 = LocalDate.of(7, 6, 5);
		System.out.println(ref5);
	}

}
