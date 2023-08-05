package com.casting.chaining;

public class Mushroom {
	public String place;
	public String color;
	public char size;
	public boolean eidible;
	
	public Mushroom(String place,String color,char size,boolean eidible) {
		System.out.println("invoking with argument constructor in Mushroom");
		this.place=place;
		this.color=color;
		this.size=size;
		this.eidible=eidible;
	}
}


