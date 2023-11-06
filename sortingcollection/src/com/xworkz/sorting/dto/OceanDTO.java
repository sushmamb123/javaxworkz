package com.xworkz.sorting.dto;

public class OceanDTO implements Comparable<OceanDTO>{
	private String OceanName;
	private String location;
	private float area;
	private float salinity;
	public OceanDTO() {
		System.out.println("invoking in no arg const in Ocean dto...");
	}
	public OceanDTO(String oceanName, String location, float area, float salinity) {
		super();
		OceanName = oceanName;
		this.location = location;
		this.area = area;
		this.salinity = salinity;
	}
	public String getOceanName() {
		return OceanName;
	}
	public void setOceanName(String oceanName) {
		OceanName = oceanName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getSalinity() {
		return salinity;
	}
	public void setSalinity(float salinity) {
		this.salinity = salinity;
	}
	@Override
	public String toString() {
		return "OceanDTO [OceanName=" + OceanName + ", location=" + location + ", area=" + area + ", salinity="
				+ salinity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OceanName == null) ? 0 : OceanName.hashCode());
		result = prime * result + Float.floatToIntBits(area);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + Float.floatToIntBits(salinity);
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
		OceanDTO other = (OceanDTO) obj;
		if (OceanName == null) {
			if (other.OceanName != null)
				return false;
		} else if (!OceanName.equals(other.OceanName))
			return false;
		if (Float.floatToIntBits(area) != Float.floatToIntBits(other.area))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Float.floatToIntBits(salinity) != Float.floatToIntBits(other.salinity))
			return false;
		return true;
	}
	@Override
	public int compareTo(OceanDTO arguments) {
		OceanDTO current=this;
		return current.OceanName.compareTo(arguments.OceanName);
	}
	

}
