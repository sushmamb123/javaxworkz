package com.xworkz.email.servlet;

import java.io.Serializable;

public class LoginDTO implements Serializable{
	String userId;
	String password;
	String no;
	String state;
	String street;
	String country;
	String city;
	public LoginDTO() {
		System.out.println("creating a LoginDTO......");
	}
	public LoginDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	public LoginDTO(String no, String state, String street, String country, String city) {
		super();
		this.no = no;
		this.state = state;
		this.street = street;
		this.country = country;
		this.city = city;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	



}
