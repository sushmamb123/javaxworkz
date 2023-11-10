package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class KnifeDTO implements Serializable{
	private String brand;
	private String bladeMaterial;
	private float length;
	private float weight;
	public KnifeDTO() {
		System.out.println("invoking in no arg const in knife dto..");
	}
	public KnifeDTO(String brand, String bladeMaterial, float length, float weight) {
		super();
		this.brand = brand;
		this.bladeMaterial = bladeMaterial;
		this.length = length;
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBladeMaterial() {
		return bladeMaterial;
	}
	public void setBladeMaterial(String bladeMaterial) {
		this.bladeMaterial = bladeMaterial;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode in knife dto");
		return 20;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PinDTO) {
				System.out.println("object in Knife dto..");
			}
			KnifeDTO dto=(KnifeDTO)obj;
			if(dto.brand.equals(this.brand)&&dto.bladeMaterial.equals(this.bladeMaterial)){
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
