package com.casting.chaining;

public class Gold {

	public String facts;
	public String color;
	public int atomicNumber;
	public String type;
	
	public Gold(String facts,String color,int atomicNumber,String type) {
		System.out.println("invoking with argument constructor in Ground");
		this.facts=facts;
		this.color=color;
		this.atomicNumber=atomicNumber;
		this.type=type;
	}



}
