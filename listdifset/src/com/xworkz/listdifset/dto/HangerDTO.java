package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class HangerDTO implements Serializable {
	private String color;
	private String brand;
	private String CountryOfOrigin;
	private double price;

	public HangerDTO() {
	}

	public HangerDTO(String color, String brand, String countryOfOrigin, double price) {
		super();
		this.color = color;
		this.brand = brand;
		CountryOfOrigin = countryOfOrigin;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HangerDTO [color=" + color + ", brand=" + brand + ", CountryOfOrigin=" + CountryOfOrigin + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("invokig hashcode in HangerDTO");
		return 48;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in HangerDTO");
		if (obj != null) {
			if (obj instanceof HangerDTO) {
			}
			HangerDTO casted = (HangerDTO) obj;
			if (casted.brand.equals(this.brand) && casted.color.equals(this.color)) {
				return true;
			}
		}
		return false;
	}
}


