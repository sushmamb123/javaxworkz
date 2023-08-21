package com.sush.method.run;

public class IntegerRunner {

	public static void main(String[] args) {
		Integer integer=new Integer(0);
		byte ref=integer.byteValue();
		System.out.println(ref);
		double ref1=integer.doubleValue();
		System.out.println(ref1);
		Integer ref2=integer.hashCode();
		System.out.println(ref2);
		boolean ref3=integer.equals(ref2);
		System.out.println(ref3);
		long ref4=integer.longValue();
		System.out.println(ref4);
		Long ref5=integer.longValue();
		System.out.println(ref5);
		Integer ref6=integer.getInteger(null);
		System.out.println(ref6);
		Integer ref7=integer.valueOf(ref);
		System.out.println(ref7);
		String ref8=integer.toBinaryString(0);
		System.out.println(ref8);
		Integer ref9=integer.hashCode(0);
		System.out.println(ref9);
		long ref10=integer.toUnsignedLong(ref);
		System.out.println(ref10);
		

		

	}

}
