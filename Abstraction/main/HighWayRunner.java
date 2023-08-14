package com.xwork.abstraction.runner;

import com.xwork.abstractions.Highway;
import com.xwork.abstractions.Road;

public class HighWayRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HighWayRunner");
		Highway highway=new Road();
		highway.implementation();
		highway.extendsTheRoad();
		highway.tollGate();
		highway.monitorData();
		highway.numberOfVehicle();
		highway.location();
		highway.materials();
		highway.money();
		highway.name();
		highway.pincode();
		
	
	

	}

}

