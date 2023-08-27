package com.xwork.String;

public class StringBufferRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StringBufferRunner");
		StringBuffer buffer=new StringBuffer();
		int ref=buffer.hashCode();
		System.out.println(ref);
		StringBuffer ref1=buffer.append(ref);
		System.out.println(ref1);
		StringBuffer ref2=buffer.append(0);
		System.out.println(ref2);
		int ref3=buffer.compareTo(buffer);
		System.out.println(ref3);
		StringBuffer ref4=buffer.append(12.4F);
		System.out.println(ref4);
		StringBuffer ref5=buffer.append("Sushma");
		System.out.println(ref5);
		StringBuffer del=buffer.deleteCharAt(1);
		System.out.println(del);
	}

}
