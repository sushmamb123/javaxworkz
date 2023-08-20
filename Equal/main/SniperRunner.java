package com.xwork.equal.main;

import com.xwork.equal.Sniper;

public class SniperRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SniperRunner");
		Sniper snip = new Sniper("Discipline", "Precision sniper Rifle", 300, 20000, 2.2, "killer");
		System.out.println(snip);
		Sniper snip2 = new Sniper("Discipline", "Precision sniper Rifle", 300, 20000, 2.2, "killer");
		System.out.println(snip2);
		System.out.println("****************************************");
		boolean same = snip.equals(snip2);
		System.out.println("Contents are same:" + same);

	}

}
