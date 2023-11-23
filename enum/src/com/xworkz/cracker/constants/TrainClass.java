package com.xworkz.cracker.constants;

public enum TrainClass {
	
	FIRST_CLASS(90),SECOND_CLASS(120),SLEEPER_CLASS(250);
	
	
	private int price;
	private TrainClass(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
