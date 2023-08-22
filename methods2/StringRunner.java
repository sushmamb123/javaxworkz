package com.sush.method.runner;

public class StringRunner {

	public static void main(String[] args) {
		String string = new String("sushma");
		String value = "Bindhu";
		int ref = string.charAt(2);
		System.out.println(ref);
		String[] split = value.split("chandhu");
		System.out.println(split);
		String[] ref2 = value.split(string, ref);
		System.out.println(ref2);
		String ref3 = string.concat(string);
		System.out.println(ref3);
		int ref4 = string.compareTo(string);
		System.out.println(ref4);
		String ref5 = string.substring(ref4);
		System.out.println(ref5);
		String ref6 = value.substring(2, 5);
		System.out.println(ref6);
		boolean ref7 = string.isEmpty();
		System.out.println(ref7);
		int ref8 = value.length();
		System.out.println(ref8);
		boolean ref9 = string.startsWith(ref6);
		System.out.println(ref9);
		boolean end = string.endsWith(ref6);
		System.out.println(end);
		boolean equal = value.equalsIgnoreCase(string);
		System.out.println(equal);
		boolean equal1 = string.equals(ref6);
		System.out.println(equal1);
		String upper = string.toUpperCase();
		System.out.println(upper);
		String lower = string.toLowerCase();
		System.out.println(lower);
		boolean blank = string.isBlank();
		System.out.println(blank);
		int index = value.indexOf(ref8);
		System.out.println(index);
		String trim = string.trim();
		System.out.println(trim);
	}
}
