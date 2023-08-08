package com.casting.chaining;

public class GiltGold extends Gold{
	public GiltGold() {
		this("Malleable","Yellow",79,"White");
		System.out.println("invoking with no-argument constructor in GiltGold");
		
	}
	public GiltGold(String fact,String color,int atomicNumber,String type) {
		super("Malleable","Yellow",79,"White");



		System.out.println("invoking with no-argument constructor in GiltGold");

	}

}
