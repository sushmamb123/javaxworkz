package com.xwork.equal.main;

import com.xwork.equal.Cook;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("ivvoking main in CookRunner");
		Cook c = new Cook("Sushma", 21, "Rote", 50, "Gas", true);
		System.out.println(c);
		Cook c2 = new Cook("Sushma", 21, "Rote", 50, "Gas", true);
		System.out.println(c2);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		boolean same = c.equals(c2);
		System.out.println("Contents are same:" + same);

	}

}
