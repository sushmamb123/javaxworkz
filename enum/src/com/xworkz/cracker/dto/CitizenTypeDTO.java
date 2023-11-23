package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.CitizenLowerAge;
import com.xworkz.cracker.constants.CitizenUpperAge;

public class CitizenTypeDTO {
	private String name;
	private CitizenLowerAge lAge;
	private CitizenUpperAge hAge;
	public CitizenTypeDTO(String name, CitizenLowerAge lAge, CitizenUpperAge hAge) {
		super();
		this.name = name;
		this.lAge = lAge;
		this.hAge = hAge;
	}
	@Override
	public String toString() {
		return "CitizenTypeDTO [name=" + name + ", lAge=" + lAge + ", hAge=" + hAge + "]";
	}
	
	public void sethAge(CitizenUpperAge hAge) {
		this.hAge = hAge;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setlAge(CitizenLowerAge lAge) {
		this.lAge = lAge;
	}

}
