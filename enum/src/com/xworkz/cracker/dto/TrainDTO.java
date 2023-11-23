package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.TrainClass;

public class TrainDTO {
	
	private TrainClass train;
	private int price;
	
	
	public TrainDTO(TrainClass train, int price) {
		super();
		this.train = train;
		this.price = price;
	}
	@Override
	public String toString() {
		return "TrainDTO [train=" + train + ", price=" + price + "]";
	}
	public void setTrain(TrainClass train) {
		this.train = train;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
