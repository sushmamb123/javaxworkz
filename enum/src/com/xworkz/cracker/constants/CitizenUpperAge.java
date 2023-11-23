package com.xworkz.cracker.constants;

public enum CitizenUpperAge {
	AGE(11),MIDDLE_AGE(48),SENIOR_CITIZEN(68);
	
	private Integer upperAge;
	private CitizenUpperAge(Integer upperAge) {
		this.upperAge=upperAge;
	}
	public void setUpperAge(Integer upperAge) {
		this.upperAge = upperAge;
	}
	public Integer getUpperAge() {
		return upperAge;
	}

}
