package com.sush.method.run;

public class StringRunner {

	public static void main(String[] args) {

		String string1 = new String();
		boolean ref = string1.contentEquals("sushma");
		System.out.println(ref);
		String name = "sushma";
		int ref1 = name.codePointBefore(1);
		System.out.println(ref1);
		boolean ref2 = name.equals(name);
		System.out.println(ref2);
		String ref3 = string1.toUpperCase();
		System.out.println(ref3);
		int ref4 = string1.indexOf(string1);
		System.out.println(ref4);
		String ref5=string1.valueOf(true);
		System.out.println(ref5);
		String ref6=name.valueOf(ref1);
		System.out.println(ref6);
		String ref7=string1.valueOf(0);
		System.out.println(ref7);
		String ref8=name.valueOf(88);
		System.out.println(ref8);
		String ref9=string1.valueOf(name);
		System.out.println(ref9);
		String ref10=string1.valueOf(0);
		System.out.println(ref10);
		
		
	}

}
