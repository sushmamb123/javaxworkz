package com.casting.chaining;

public class PoisionMushroom extends Mushroom{
	public PoisionMushroom() {
		this("Soil","White",'S',true);
		System.out.println("invoking with no-argument constructor in PoisionMushroom");
		
	}
	public PoisionMushroom(String place,String color,char size,boolean eidible) {
		super("Soil","White",'S',true);
		System.out.println("invoking with no-argument constructor in PoisionMushroom");

	}
}
