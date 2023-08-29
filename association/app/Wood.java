package com.xwork.farmer.app;

public class Wood {
	private double price;
	private Paper paper;

	public Wood(double price) {
		this.price = price;
	}

	public void setWood(Paper paper) {
		this.paper = paper;
	}

	public void polish() {
		System.out.println("invoking polish() in wood");
		this.paper.material();

	}

}
