package com.xworkz.collection.app.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable{
	private int id;
	private String HotelName;
	private String ownerName;
	private String gst;
	private String location;
	public HotelDTO() {
		System.out.println("invoking no arg const..");
	}
	public HotelDTO(int id, String hotelName, String ownerName, String gst, String location) {
		super();
		this.id = id;
		HotelName = hotelName;
		this.ownerName = ownerName;
		this.gst = gst;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", HotelName=" + HotelName + ", ownerName=" + ownerName + ", gst=" + gst
				+ ", location=" + location + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		if (HotelName == null) {
			if (other.HotelName != null)
				return false;
		} else if (!HotelName.equals(other.HotelName))
			return false;
		if (gst == null) {
			if (other.gst != null)
				return false;
		} else if (!gst.equals(other.gst))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	
}