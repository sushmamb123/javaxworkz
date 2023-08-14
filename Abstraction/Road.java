package com.xwork.abstractions;

public class Road extends Highway {
	@Override
	public void implementation() {
		System.out.println("invoking implementation of Road");

	}

	@Override
	public void extendsTheRoad() {
		System.out.println("invoking extends the road ");

	}

	@Override
	public void tollGate() {
		System.out.println("invoking tollGate in Road");
	}

	@Override
	public void monitorData() {
		System.out.println("invoking monitor data in Road");

	}

	@Override
	public void numberOfVehicle() {
		System.out.println("invoking number of vehicle in Road");
	}

}
