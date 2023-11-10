package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class HardWareDTO implements Serializable{
	private String name;
	private String manufacture;
	private double price;
	private boolean availability;
	public HardWareDTO() {
		System.out.println("no-arg const in Hardware dto..");
	}
	public HardWareDTO(String name, String manufacture, double price, boolean availability) {
		super();
		this.name = name;
		this.manufacture = manufacture;
		this.price = price;
		this.availability = availability;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public int hashCode() {
		System.out.println("invoking in hashcode in Hardwaredto...");
		return 70;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PinDTO) {
				System.out.println("object in Hardware dto..");
			}
			HardWareDTO dto=(HardWareDTO)obj;
			if(dto.name.equals(this.name)&&dto.manufacture.equals(this.manufacture)){
				return true;
			}
			else {
				System.err.println("instance is same");
				return false;
			}
		}
		return false;
	}

}