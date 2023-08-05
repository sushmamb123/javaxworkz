package com.casting.chaining;

public class Ground {
	public String soil;
	public String properties;
	public float ph;
	public String madeOf;
	
	public Ground(String soil,String properties,float ph,String madeOf) {
		System.out.println("invoking with argument constructor in Ground");
		this.soil=soil;
		this.properties=properties;
		this.ph=ph;
		this.madeOf=madeOf;
	}

}
