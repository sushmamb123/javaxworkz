package com.xworkz.cracker.constants;

public enum MovieTicketPrice {
	BALCONY(250),GANDHI_CLASS(100);
	
	private Integer price;
	private MovieTicketPrice(Integer price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
