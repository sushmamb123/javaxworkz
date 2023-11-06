package com.xworkz.sorting.dto;

public class TowerDTO implements Comparable<TowerDTO>{
	private String towerName;
	private float height;
	private int numberOfFloors;
	private float bandwidth;
	
	public TowerDTO() {
		System.out.println("invoking in no arg const in TowerDTO");
	}

	public TowerDTO(String towerName, float height, int numberOfFloors, float bandwidth) {
		super();
		this.towerName = towerName;
		this.height = height;
		this.numberOfFloors = numberOfFloors;
		this.bandwidth = bandwidth;
	}

	public String getTowerName() {
		return towerName;
	}

	public void setTowerName(String towerName) {
		this.towerName = towerName;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public float getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(float bandwidth) {
		this.bandwidth = bandwidth;
	}

	@Override
	public String toString() {
		return "TowerDTO [towerName=" + towerName + ", height=" + height + ", numberOfFloors=" + numberOfFloors
				+ ", bandwidth=" + bandwidth + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(bandwidth);
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + numberOfFloors;
		result = prime * result + ((towerName == null) ? 0 : towerName.hashCode());
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
		TowerDTO other = (TowerDTO) obj;
		if (Float.floatToIntBits(bandwidth) != Float.floatToIntBits(other.bandwidth))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (numberOfFloors != other.numberOfFloors)
			return false;
		if (towerName == null) {
			if (other.towerName != null)
				return false;
		} else if (!towerName.equals(other.towerName))
			return false;
		return true;
	}

	@Override
	public int compareTo(TowerDTO arguments) {
		TowerDTO current=this;
		if(current.numberOfFloors==arguments.numberOfFloors) {
			return 0;
		}
		if(current.numberOfFloors>arguments.numberOfFloors) {
			return 123;
		}
		if(current.numberOfFloors<arguments.numberOfFloors) {
			return -67;
		}
		return 0;
	}
	

}
