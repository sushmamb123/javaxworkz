package com.xwork.String;

public class StringBuilderRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StringBuilderRunner");
		StringBuilder builder=new StringBuilder();
		boolean ref=builder.isEmpty();
		System.out.println(ref);
		StringBuilder ref1=builder.append(1);
		System.out.println(ref1);
		StringBuilder ref2=builder.append(4);
		System.out.println(ref2);
		StringBuilder ref3=builder.append(1.2f);
		System.out.println(ref3);
		StringBuilder ref4=builder.append("Sushma");
		System.out.println(ref4);
		char ref5=builder.charAt(4);
		System.out.println(ref5);
		
	}

}
