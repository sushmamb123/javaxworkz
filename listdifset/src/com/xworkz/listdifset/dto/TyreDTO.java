package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class TyreDTO implements Serializable{
	private String name;
	private String brand;
	private float treadDepth;
	private String size;
	public TyreDTO() {
		System.out.println("invoking no-arg constructor in tyre......");
	}
	public TyreDTO(String name, String brand, float treadDepth, String size) {
		super();
		this.name = name;
		this.brand = brand;
		this.treadDepth = treadDepth;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getTreadDepth() {
		return treadDepth;
	}
	public void setTreadDepth(float treadDepth) {
		this.treadDepth = treadDepth;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public int hashCode() {
		System.out.println("invoking hashcode in TyreDTO..........");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof TyreDTO) {
				System.out.println("Object is Tyre dto...");
			}
			TyreDTO dto=(TyreDTO)obj;
			if(dto.name.equals(this.name)&&dto.brand.equals(this.brand)) {
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
