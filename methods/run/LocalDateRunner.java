package com.sush.method.run;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {
	public static void main(String[] args) {
		LocalDate localDate = new LocalDate();
		boolean ref = localDate.equals("run");
		System.out.println(ref);
		Class ref1=localDate.getClass();
		System.out.println(ref1);
		int ref2=localDate.hashCode();
		localDate.notify();
		localDate.notifyAll();
		String ref3=localDate.toString();
		System.out.println(ref3);
	}
	}


