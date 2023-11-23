package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.Color;
import com.xworkz.cracker.constants.CrackerType;

public class CrackerDTO {
	private Double price;
	private CrackerType type;
	private Color color=Color.GREEN;
	private String name;
	
	@Override
	public String toString() {
		return "CrackerDTO [price=" + price + ", type=" + type + ", color=" + color + ", name=" + name + "]";
	}

	public CrackerDTO(CrackerType type) {
		this.type=type;
		
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}

}
