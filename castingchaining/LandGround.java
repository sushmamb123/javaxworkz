package com.casting.chaining;

public class LandGround extends Ground{
	public LandGround() {
		this("Black Soil","Texture",8.6f,"Minerals");
		System.out.println("invoking with no-argument constructor in LandGround");
		
	}
	public LandGround(String soil,String properties,float ph,String madeOf) {
		super("Black Soil","Texture",8.6f,"Minerals");


		System.out.println("invoking with no-argument constructor in LandGround");

	}

}
