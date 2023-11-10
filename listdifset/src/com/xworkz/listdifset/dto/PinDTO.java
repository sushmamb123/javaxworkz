package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class PinDTO implements Serializable{
	private String pointType;
	private float length;
	private float thickness;
	private String material;
	public PinDTO() {
		System.out.println("invoking in no arg const in Pin dto..");
	}
	
	public PinDTO(String pointType, float length, float thickness, String material) {
		super();
		this.pointType = pointType;
		this.length = length;
		this.thickness = thickness;
		this.material = material;
	}
	

	public String getPointType() {
		return pointType;
	}

	public void setPointType(String pointType) {
		this.pointType = pointType;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		System.out.println("invoking in hashcode in Pin dto..");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PinDTO) {
				System.out.println("object in pin dto..");
			}
			PinDTO dto=(PinDTO)obj;
			if(dto.pointType.equals(this.pointType)&&dto.material.equals(this.material)){
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
