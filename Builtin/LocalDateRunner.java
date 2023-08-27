package com.xwork.String;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LocalDateRunner");
		LocalDate localdate=LocalDate.now();
		LocalDateTime ref=localdate.atStartOfDay();
		System.out.println(ref);
		LocalDateTime ref2=localdate.atTime(12,11);
		System.out.println(ref2);
		LocalDateTime time=localdate.atTime(12, 10);
		System.out.println(time);
		LocalDateTime ref3=localdate.atTime(11,10);
		System.out.println(ref3);
		int ref4=localdate.getMonthValue();
		System.out.println(ref4);
		boolean ref5=localdate.equals(ref3);
		System.out.println(ref5);
	}
}

