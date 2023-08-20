package com.xwork.equal.main;

import com.xwork.equal.Minister;

public class MinisterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MinisterRunner");
		Minister minister = new Minister("Om Minister", 10000, 5, 6, "India", "Abc");
		System.out.println(minister);
		Minister minister2 = new Minister("Chief Minister", 200000, 6, 5, "India", "CDE");
		System.out.println(minister2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		boolean same = minister.equals(minister2);
		System.out.println("contents are same:" + same);

	}
}
