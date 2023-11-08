package com.xworkz.sorting.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class IceCreamDTO implements Serializable,Comparable<IceCreamDTO>{
	private String flavour;
	private String color;
	private Double price;
	private LocalDate manufactureDate;
	private String type;
	public IceCreamDTO() {
		
	}
	public IceCreamDTO(String flavour, String color, double price, LocalDate manufactureDate, String type) {
		super();
		this.flavour = flavour;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.type = type;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "IceCreamDTO [flavour=" + flavour + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ manufactureDate + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCreamDTO other = (IceCreamDTO) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public int compareTo(IceCreamDTO argument) {
		return this.price.compareTo(argument.price);
	}
	
	
}
	