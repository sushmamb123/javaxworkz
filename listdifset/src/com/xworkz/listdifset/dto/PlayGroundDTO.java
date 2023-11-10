package com.xworkz.listdifset.dto;

import java.io.Serializable;

public class PlayGroundDTO implements Serializable{

	private String type;
	private int size;
	private float width;
	private String location;

	public PlayGroundDTO() {
	}

	public PlayGroundDTO(String type, int size, float width, String location) {
		super();
		this.type = type;
		this.size = size;
		this.width = width;
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "PlayGroundDTO [type=" + type + ", size=" + size + ", width=" + width + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return 88;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PlayGroundDTO) {
			}
			PlayGroundDTO casted = (PlayGroundDTO) obj;
			if (casted.location.equals(this.location) && casted.type.equals(this.type)) {
				return true;
			}
		}
		return false;

	}
}