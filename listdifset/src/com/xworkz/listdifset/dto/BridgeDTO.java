package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class BridgeDTO implements Serializable{
	private String type;
	private int weight;
	private boolean isSuspension;
	private String material;

	public BridgeDTO() {
		super();
	}

	public BridgeDTO(String type, int weight, boolean isSuspension, String material) {
		super();
		this.type = type;
		this.weight = weight;
		this.isSuspension = isSuspension;
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isSuspension() {
		return isSuspension;
	}

	public void setSuspension(boolean suspension) {
		isSuspension = suspension;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "BridgeDTO [type=" + type + ", weight=" + weight + ", isSuspension=" + isSuspension + ", material="
				+ material + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for BridgeDTO....");
		if (obj != null) {
			if (obj instanceof BridgeDTO) {
				BridgeDTO dto = (BridgeDTO) obj;
				if (dto.getType().equals(this.type) && dto.getWeight() == this.weight
						&& dto.isSuspension() == this.isSuspension && dto.getMaterial().equals(this.material)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for BridgeDTO....");
		return 999;
	}

}
