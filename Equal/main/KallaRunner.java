package com.xwork.equal.main;

import com.xwork.equal.Kalla;

public class KallaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in KallaRunner");
		Kalla kal = new Kalla("Sushma", 25, "Bad", "By name", "Locking Door properly", false);
		System.out.println(kal);
		Kalla kal2 = new Kalla("Sushma", 25, "Bad", "By name", "Locking Door properly", false);
		System.out.println(kal2);
		System.out.println("**************************************");
		boolean same = kal.equals(kal2);
		System.out.println("Contents are same:" + same);

	}

}
