package com.xwork.farmer.app;

public class Pant {
	private int size;
	private Zip zip;

	public Pant(int size) {
		this.size = size;
	}

	public void setPant(Zip zip) {
		this.zip = zip;
	}

	public void washing() {
		System.out.println("invoking washing() in Pant");
		this.zip.join();
	}
}
