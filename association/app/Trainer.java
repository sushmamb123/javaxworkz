package com.xwork.farmer.app;

public class Trainer {
	private double salary;
	private Laptop laptop;

	public Trainer(double salary) {
		this.salary = salary;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void teaching() {
		System.out.println("invoking teaching() in trainner");
		this.laptop.programming();
	}

}
