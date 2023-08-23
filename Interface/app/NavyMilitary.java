package com.xwork.inter.app;

import com.xwork.inter.Military;

public class NavyMilitary implements Military {

	@Override
	public String name(String soliderName) {
		System.out.println("invoking name in NavyMilitary");
		return null;
	}

	@Override
	public void age(int age) {
		System.out.println("invoking age in NavyMilitary");

	}

	@Override
	public void weapon(String weaponName) {
		System.out.println("invoking weapon in NavyMilitary");
	}

}
