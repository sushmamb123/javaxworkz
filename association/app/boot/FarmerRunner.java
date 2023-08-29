package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Farmer;
import com.xwork.farmer.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FarmerRunner");
		String name="Sachin";
		Land land=new Land();
		Farmer farm=new Farmer(name);
		farm.setLand(land);
		farm.farming();
	}

}
