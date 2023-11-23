package com.xworkz.cracker.constants;

public enum CitizenLowerAge {
	
	AGE(10),MIDDLE_AGE(45),SENIOR_CITIZEN(65);
	
	private Integer lowerAge;
	
	private CitizenLowerAge(Integer lowerAge) {
		this.lowerAge=lowerAge;
	}
	public Integer getLowerAge() {
		return lowerAge;
	}
	

}
