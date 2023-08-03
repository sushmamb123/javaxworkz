package com.example.casting.ex5;

public class LocalBrand extends Brand{
	public float ratings=4.00f;
	
	public void local() {
		System.out.println("invoking local in LocalBrand");
		System.out.println("Ratings of LocalBrand:"+ratings);
	}

}
