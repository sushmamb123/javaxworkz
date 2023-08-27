package com.xwork.diamond.run;

import com.xwork.diamond.ApartmentRule;
import com.xwork.diamond.BuildApartmentRule;
import com.xwork.diamond.CommonApartmentRule;
import com.xwork.diamond.PurchaseApartmentRule;
import com.xwork.diamond.rule.PrestigeApartmentRule;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("invoking main in MainMethod");
		ApartmentRule rule=new PrestigeApartmentRule();
		PurchaseApartmentRule rule1=new PrestigeApartmentRule();
		CommonApartmentRule rule2=new PrestigeApartmentRule();
		BuildApartmentRule rule3=new PrestigeApartmentRule();
		rule.construct();
		rule1.construct();
		rule2.construct();
		rule3.construct();
		rule.lift();
		rule.noOfSteps();
	}

}
