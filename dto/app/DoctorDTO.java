package com.xwork.dto.app;

import java.io.Serializable;

public class DoctorDTO implements Serializable {
	private String name;
	private String location;
	private int cost;
	private long mobileNumber;

	public DoctorDTO() {
		System.out.println("invoking no-arg const in DoctorDTO");
	}

	public DoctorDTO(String name, String location, int cost, long mobileNumber) {
		super();
		this.name = name;
		this.location = location;
		this.cost = cost;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", location=" + location + ", cost=" + cost + ", mobileNumber="
				+ mobileNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
