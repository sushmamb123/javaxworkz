package com.sush.method.runner;

import java.util.Date;

public class DateRunner {

	public static void main(String[] args) {
		Date date = new Date(22 - 8 - 2023);
		Object clone = date.clone();
		System.out.println(clone);
		int compare = date.compareTo(date);
		System.out.println(compare);
		long time = date.getTime();
		System.out.println(time);
		int year = date.getYear();
		System.out.println(year);
		int hash = date.hashCode();
		System.out.println(hash);
	}
}
