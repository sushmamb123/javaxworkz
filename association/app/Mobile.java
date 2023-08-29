package com.xwork.farmer.app;

public class Mobile {
	private String name;
	private Charger charger;

	public Mobile(String name) {
		this.name = name;
	}

	public void setMobile(Charger charger) {
		this.charger = charger;
	}

	public void msg() {
		System.out.println("invoking msg() in mobile");
	}

	public void call() {
		System.out.println("invoking call() in Mobile");
	}

	public void typing() {
		System.out.println("invoking typing() in Mobile");
	}

	public void music() {
		System.out.println("invoking music() in mobile");
		this.charger.battery();
		this.charger.cable();
		this.charger.pin();
		this.charger.voltage();
	}

}
