package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.ShoeType;
import com.xworkz.cracker.constants.Size;

public class ShoeDTO {
	private ShoeType type;
	private Size size=Size.BIG;
	private String brand;
	private Double cost;
	
	public ShoeDTO(ShoeType type) {
		this.type=type;
	}
	
	@Override
	public String toString() {
		return "ShoeDTO [type=" + type + ", size=" + size + ", brand=" + brand + ", cost=" + cost + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	

}
