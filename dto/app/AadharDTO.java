package com.xwork.dto.app;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	private String citizen;
	private long aadharNumber;
	private int pincode;
	private String name;

	public AadharDTO() {
		System.out.println("invoking no_arg const in AadharDTO");
	}

	public AadharDTO(String citizen, long aadharNumber, int pincode, String name) {
		super();
		this.citizen = citizen;
		this.aadharNumber = aadharNumber;
		this.pincode = pincode;
		this.name = name;
	}

	@Override
	public String toString() {
		return "AadharDTO [citizen=" + citizen + ", aadharNumber=" + aadharNumber + ", pincode=" + pincode + ", name="
				+ name + "]";
	}

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
