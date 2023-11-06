package com.xworkz.sorting.dto;

public class TheaterDTO implements Comparable<TheaterDTO>{
	private String theaterName;
	private String location;
	private int seats;
	private boolean facility;
	public TheaterDTO() {
		System.out.println("invoking in theater dto...");
	}
	public TheaterDTO(String theaterName, String location, int seats, boolean facility) {
		super();
		this.theaterName = theaterName;
		this.location = location;
		this.seats = seats;
		this.facility = facility;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public boolean isFacility() {
		return facility;
	}
	public void setFacility(boolean facility) {
		this.facility = facility;
	}
	@Override
	public String toString() {
		return "TheaterDTO [theaterName=" + theaterName + ", location=" + location + ", seats=" + seats + ", facility="
				+ facility + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (facility ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + seats;
		result = prime * result + ((theaterName == null) ? 0 : theaterName.hashCode());
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
		TheaterDTO other = (TheaterDTO) obj;
		if (facility != other.facility)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (seats != other.seats)
			return false;
		if (theaterName == null) {
			if (other.theaterName != null)
				return false;
		} else if (!theaterName.equals(other.theaterName))
			return false;
		return true;
	}
	@Override
	public int compareTo(TheaterDTO arguments) {
		TheaterDTO current=this;
		return current.theaterName.compareTo(arguments.theaterName);
	}
	
	

}
