package com.casting.chaining;

public class Diamond {
	public String symbol;
	public String properties;
	public String color;
	public String nakshatra;
	
	public Diamond(String symbol,String properties,String color,String nakshatra) {
		System.out.println("invoking with argument constructor in Diamond");
		this.symbol=symbol;
		this.properties=properties;
		this.color=color;
		this.nakshatra=nakshatra;
	}
}


