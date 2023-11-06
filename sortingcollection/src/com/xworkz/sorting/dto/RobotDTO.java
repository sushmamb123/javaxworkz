package com.xworkz.sorting.dto;

public class RobotDTO implements Comparable<RobotDTO> {
	private String uses;
	private boolean userFriendly;
	private String types;
	private float size;

	public RobotDTO() {
		System.out.println("invoking in Robot dto...");
	}

	public RobotDTO(String uses, boolean userFriendly, String types, float size) {
		super();
		this.uses = uses;
		this.userFriendly = userFriendly;
		this.types = types;
		this.size = size;
	}

	public String getUses() {
		return uses;
	}

	public void setUses(String uses) {
		this.uses = uses;
	}

	public boolean isUserFriendly() {
		return userFriendly;
	}

	public void setUserFriendly(boolean userFriendly) {
		this.userFriendly = userFriendly;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "RobotDTO [uses=" + uses + ", userFriendly=" + userFriendly + ", types=" + types + ", size=" + size
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(size);
		result = prime * result + ((types == null) ? 0 : types.hashCode());
		result = prime * result + (userFriendly ? 1231 : 1237);
		result = prime * result + ((uses == null) ? 0 : uses.hashCode());
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
		RobotDTO other = (RobotDTO) obj;
		if (Float.floatToIntBits(size) != Float.floatToIntBits(other.size))
			return false;
		if (types == null) {
			if (other.types != null)
				return false;
		} else if (!types.equals(other.types))
			return false;
		if (userFriendly != other.userFriendly)
			return false;
		if (uses == null) {
			if (other.uses != null)
				return false;
		} else if (!uses.equals(other.uses))
			return false;
		return true;
	}

	@Override
	public int compareTo(RobotDTO arguments) {
			RobotDTO current = this;
			return current.types.compareTo(arguments.types);

		
		
	}

	

}
