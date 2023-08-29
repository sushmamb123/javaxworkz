package com.xwork.farmer.app;

public class Laptops {
	private String brand;
	private Processor processor;
	public Laptops(String brand) {
		this.brand=brand;
	}
	public void setLaptops(Processor processor) {
		this.processor=processor;
	}

	public void program() {
		System.out.println("invoking program() in Laptops");
	}

	public void movie() {
		System.out.println("invoking movie() in Laptops");
	}

	public void game() {
		System.out.println("invoking game() in Laptops");
	}

	public void chatting() {
		System.out.println("invokingchatting() in laptops");
		this.processor.memory();
		this.processor.ram();
		this.processor.size();
		this.processor.speed();
	}

}
