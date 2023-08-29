package com.xwork.farmer.app;

public class Shirt {
	private String colour;
	private Button button;

	public Shirt(String colour) {
		this.colour = colour;

	}

	public void setShirt(Button button) {
		this.button = button;
	}

	public void wearing() {
		System.out.println("invoking wearing() in Shirt");
		this.button.joining();

	}

}
