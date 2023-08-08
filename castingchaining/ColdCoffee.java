package com.casting.chaining;

public class ColdCoffee extends Coffee{
	public ColdCoffee() {
		this("Bru",20,50.0d,true);
		System.out.println("invoking with no-argument constructor in ColdCoffee");
		
	}
	public ColdCoffee(String brand,int quantity,double price,boolean tasty) {
		super("Bru",20,50.0d,true);



		System.out.println("invoking with no-argument constructor in ColdCoffee");

	}


}
