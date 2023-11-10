package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class CrackerDTO implements Serializable{
	private String type;
	private String colour;
	private float duration;
	private float safetyDistance;
	public CrackerDTO() {
		System.out.println("invoking no arg const in cracker dto");
	}
	public CrackerDTO(String type, String colour, float duration, float safetyDistance) {
		super();
		this.type = type;
		this.colour = colour;
		this.duration = duration;
		this.safetyDistance = safetyDistance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getSafetyDistance() {
		return safetyDistance;
	}
	public void setSafetyDistance(float safetyDistance) {
		this.safetyDistance = safetyDistance;
	}
	@Override
	public int hashCode() {
		System.out.println("invoking hashcode in cracker dto");
		return 99;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CrackerDTO) {
				System.out.println("object in cracker dto..");
			}
			CrackerDTO crackerDTO=(CrackerDTO)obj;
			if(crackerDTO.duration==this.duration&&crackerDTO.safetyDistance==this.safetyDistance) {
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
