package com.casting.chaining;

public class Rope {
	public String use;
	public String materials;
	public float diameter;
	public double price;
	
	public Rope(String use,String materials,float diameter,double price) {
		System.out.println("invoking with argument constructor in Rope");
		this.use=use;
		this.materials=materials;
		this.diameter=diameter;
		this.price=price;
	}

}
