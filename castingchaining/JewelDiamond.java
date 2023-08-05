package com.casting.chaining;

public class JewelDiamond extends Diamond {
	public JewelDiamond() {
		this("Black Diamond sult","Hardness","White","Bharani");
		System.out.println("invoking with no-argument constructor in JewelDiamond");
		
	}
	public JewelDiamond(String symbol,String properties,String color,String nakshatra) {
		super("Black Diamond sult","Hardness","White","Bharani");



		System.out.println("invoking with no-argument constructor in JewelDiamond");

	}

}
