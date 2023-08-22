package com.sush.method.runner;

import java.time.LocalDateTime;

public class LocalDateTimeRunner {

	public static void main(String[] args) {
		LocalDateTime localDateTime;
		LocalDateTime ref = LocalDateTime.now();
		System.out.println(ref);
		LocalDateTime ref1 = LocalDateTime.of(8, 7, 6, 5, 4);
		System.out.println(ref1);
		LocalDateTime ref2 = LocalDateTime.of(8, 4, 7, 6, 5);
		System.out.println(ref2);
		LocalDateTime ref3 = LocalDateTime.of(8, 7, 6, 5, 4, 3, 2);
		System.out.println(ref3);
		LocalDateTime ref4 = LocalDateTime.of(9, 8, 7, 6, 5, 4);
		System.out.println(ref4);
	}

}
