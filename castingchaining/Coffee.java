package com.casting.chaining;

public class Coffee {
	public String brand;
	public int quantity;
	public double price;
	public boolean tasty;

	public Coffee(String brand, int quantity, double price, boolean tasty) {
		System.out.println("invoking with argument constructor in Coffee");
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.tasty = tasty;

	}
}
