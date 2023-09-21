package com.xwork.dto.app;

import java.io.Serializable;


public class VehicleDTO implements Serializable {
	private String name;
	private double cost;
	private float weight;
	private String properties;
	private float engineCapacity;
	private int cc;
	private String types;
	private int length;
	private int width;
	private String country;

	public VehicleDTO() {
		System.out.println("invoking in default const");
	}

	public VehicleDTO(String name, double cost, float weight, String properties, float engineCapacity, int cc,
			String types, int length, int width, String country) {
		super();
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.properties = properties;
		this.engineCapacity = engineCapacity;
		this.cc = cc;
		this.types = types;
		this.length = length;
		this.width = width;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "VehicleDTO [name=" + name + ", cost=" + cost + ", weight=" + weight + ", properties=" + properties
				+ ", engineCapacity=" + engineCapacity + ", cc=" + cc + ", types=" + types + ", length=" + length
				+ ", width=" + width + ", country=" + country + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof VehicleDTO) {
				System.out.println("Object is DeveloperDTO");
			}
			VehicleDTO casted = (VehicleDTO) obj;
			if (casted.name.equals(obj) && casted.cost == this.cost && casted.weight == this.weight
					&& casted.properties.equals(obj) && casted.engineCapacity == this.engineCapacity
					&& casted.cc == this.cc && casted.types.equals(obj) && casted.length == this.length
					&& casted.width == this.width && casted.country.equals(obj)) {
				System.out.println("Instance is same");
				return true;
			} else {
				System.err.println("Instance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}

}
