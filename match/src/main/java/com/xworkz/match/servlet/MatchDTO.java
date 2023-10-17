package com.xworkz.match.servlet;

import java.io.Serializable;

public class MatchDTO implements Serializable{
	private String name;
	private String country;
	private String date;
	private String team1;
	private String team2;
	private String team1CName;
	private String team2CName;
	private String umpireName;
	private String stadiumName;
	private String thirdUmpireName;
	private String stadiumCapacity;

	public MatchDTO() {
		super();
	}

	public MatchDTO(String name, String country, String date, String team1, String team2, String team1cName,
			String team2cName, String umpireName, String stadiumName, String thirdUmpireName, String stadiumCapacity) {
		super();
		this.name = name;
		this.country = country;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.team1CName = team1cName;
		this.team2CName = team2cName;
		this.umpireName = umpireName;
		this.stadiumName = stadiumName;
		this.thirdUmpireName = thirdUmpireName;
		this.stadiumCapacity = stadiumCapacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTeam1CName() {
		return team1CName;
	}

	public void setTeam1CName(String team1cName) {
		team1CName = team1cName;
	}

	public String getTeam2CName() {
		return team2CName;
	}

	public void setTeam2CName(String team2cName) {
		team2CName = team2cName;
	}

	public String getUmpireName() {
		return umpireName;
	}

	public void setUmpireName(String umpireName) {
		this.umpireName = umpireName;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getThirdUmpireName() {
		return thirdUmpireName;
	}

	public void setThirdUmpireName(String thirdUmpireName) {
		this.thirdUmpireName = thirdUmpireName;
	}

	public String getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(String stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	@Override
	public String toString() {
		return "MatchDTO [name=" + name + ", country=" + country + ", date=" + date + ", team1=" + team1 + ", team2="
				+ team2 + ", team1CName=" + team1CName + ", team2CName=" + team2CName + ", umpireName=" + umpireName
				+ ", stadiumName=" + stadiumName + ", thirdUmpireName=" + thirdUmpireName + ", stadiumCapacity="
				+ stadiumCapacity + "]";
	}

}


