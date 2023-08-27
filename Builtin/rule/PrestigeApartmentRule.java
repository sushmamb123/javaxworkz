package com.xwork.diamond.rule;

import com.xwork.diamond.ApartmentRule;

public class PrestigeApartmentRule implements ApartmentRule{
	@Override
	public void construct() {
		System.out.println("invoking construct() in PrestigeApartmentRule");
	}

	@Override
	public int noOfSteps() {
		System.out.println("invoking noOfSteps() in PrestigeApartmentRule();");
		return 0;
	}

	@Override
	public boolean lift() {
		System.out.println("invoking lift() in PrestigeApartmentRule();");
		return false;
	}

}
