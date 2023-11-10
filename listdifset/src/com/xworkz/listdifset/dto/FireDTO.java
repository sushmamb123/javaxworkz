package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class FireDTO implements Serializable{
	private String fuelType;
	private float temperature;
	private int intensity;
	private String colour;
	public FireDTO() {
		System.out.println("Fire dto in no arg constructor....");
	}
	public FireDTO(String fuelType, float temperature, int intensity, String colour) {
		super();
		this.fuelType = fuelType;
		this.temperature = temperature;
		this.intensity = intensity;
		this.colour = colour;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public int hashCode() {
		System.out.println("invoking in fire dto in hashcode...");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof FireDTO) {
				System.out.println("object of FireDTO");
			}
			FireDTO dto=(FireDTO)obj;
			if(dto.fuelType.equals(this.fuelType)&&dto.colour.equals(this.colour)) {
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
