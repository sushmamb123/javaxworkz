package com.xwork.inter.app;

import com.xwork.inter.TempleRules;

public class AnjaneyaTemple implements TempleRules {

	@Override
	public void dress(String name) {
		System.out.println("invoking String in dress");
	}

	@Override
	public boolean photo() {
		System.out.println("invoking boolean in photo");
		return false;
	}

	@Override
	public double fees(double entryFees) {
		System.out.println("invoking double in fees");
		return 0;
	}

}
