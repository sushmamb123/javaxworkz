package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.MovieTicketGst;
import com.xworkz.cracker.constants.MovieTicketPrice;

public class MovieTicketDTO {
	
	private Double discount;
	private MovieTicketPrice price;
	private MovieTicketGst gst;
	@Override
	public String toString() {
		return "MovieTicketDTO [discount=" + discount + ", price=" + price + ", gst=" + gst + "]";
	}
	public MovieTicketDTO( MovieTicketPrice price, MovieTicketGst gst) {
		this.price = price;
		this.gst = gst;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public void setPrice(MovieTicketPrice price) {
		this.price = price;
	}
	public void setGst(MovieTicketGst gst) {
		this.gst = gst;
	}
	public Double getDiscount() {
		return discount;
	}
	public MovieTicketGst getGst() {
		return gst;
	}
	public MovieTicketPrice getPrice() {
		return price;
	}
	

}
