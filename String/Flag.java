package com.xwork.String;

public class Flag {
	private String colour;
	private double price;
	private String usedFor;

	public Flag(String colour, double price, String usedFor) {
		super();
		this.colour = colour;
		this.price = price;
		this.usedFor = usedFor;
	}

	@Override
	public String toString() {
		return "Color:" + this.colour + "Price:" + this.price + "UsedFor:" + this.usedFor;
	}

}
