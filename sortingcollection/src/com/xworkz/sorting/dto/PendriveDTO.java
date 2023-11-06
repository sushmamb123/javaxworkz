package com.xworkz.sorting.dto;


public class PendriveDTO implements Comparable<PendriveDTO>{
	private String capacity;
	private String brand;
	private boolean secure;
	private int speed;
	public PendriveDTO() {
		System.out.println("invoking main in Pendrive dto");
	}
	public PendriveDTO(String capacity, String brand, boolean secure, int speed) {
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.secure = secure;
		this.speed = speed;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isSecure() {
		return secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "PendriveDTO [capacity=" + capacity + ", brand=" + brand + ", secure=" + secure + ", speed=" + speed
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + (secure ? 1231 : 1237);
		result = prime * result + speed;
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
		PendriveDTO other = (PendriveDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (secure != other.secure)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}
	//when current instance is same of arguments written 0(zero)
	//when current instance is > greater than arguments wrriten +number
	//when current instance is< than arguments it return negative number
	//for asending order
	//for desending order condition is reverse
	@Override
	public int compareTo(PendriveDTO arguments) {
		PendriveDTO current=this;
		if(current.speed==arguments.speed) {
			return 0;
		}
		if(current.speed>arguments.speed) {
			return 123;
		}
		if(current.speed<arguments.speed) {
			return -89;
		}
		throw new IllegalArgumentException("can not sorted");
	}
	
	
	

}
