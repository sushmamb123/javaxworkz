package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class WireDTO implements Serializable{
	private String name;
	private String colour;
	private int noOfwires;
	private double price;
	public WireDTO() {
		System.out.println("invoking no arg const....in wire");
	}
	public WireDTO(String name, String colour, int noOfwires, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.noOfwires = noOfwires;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfwires() {
		return noOfwires;
	}
	public void setNoOfwires(int noOfwires) {
		this.noOfwires = noOfwires;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		System.out.println("invoking in hasch code in wire dto........");
		return 99;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WireDTO) {
				System.out.println("object is wireDTO");
			}
			WireDTO ref=(WireDTO)obj;
			if(ref.name.equals(this.name)&& ref.colour.equals(this.colour)) {
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
