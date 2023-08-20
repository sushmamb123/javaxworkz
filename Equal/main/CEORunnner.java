package com.xwork.equal.main;

import com.xwork.equal.CEO;

public class CEORunnner {

	public static void main(String[] args) {
		System.out.println("invoking main in CEORunner");
		CEO ceo = new CEO("Culture", "Openness", "Organizing", 50, 100000, 7);
		System.out.println(ceo);
		CEO ceo2 = new CEO("People", "Extraversion", "Staffing", 52, 10000, 5);
		System.out.println(ceo2);
		System.out.println("****************************************");
		boolean same = ceo.equals(ceo2);
		System.out.println("Contents are same:" + same);


	}

}
