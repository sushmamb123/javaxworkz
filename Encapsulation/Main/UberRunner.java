package com.encapsulation.main;

import com.encapsulation.in.Uber;

public class UberRunner {

	public static void main(String[] args) {
		Uber uber = new Uber();
		System.out.println("invoking main in Uber killer");

		uber.setTransport("in bus");
		System.out.println("transport in " + uber.getTransport());
		uber.setSize("Long");
		System.out.println("Size is " + uber.getSize());
		uber.setAuto("Auto");
		System.out.println("Book  " + uber.getAuto());
		uber.setNoOfSeats(4);
		System.out.println("Total no of seats " + uber.getNoOfSeats());
		uber.setBike("Rapido");
		System.out.println("Total no of seats " + uber.getBike());
		uber.setTarget("Bangalore");
		System.out.println("Target is " + uber.getTarget());
		uber.setCar("Car");
		System.out.println("get booking in " + uber.getCar());
		uber.setOnlineBooking("online booking for reservation");
		System.out.println("get ticket booking in " + uber.getOnlineBooking());
		uber.setNoOfPassengers(4);
		System.out.println("Total no of Passenger " + uber.getNoOfPassengers());
		uber.setBetterRoads("For smooth traveling");
		System.out.println("Get betterr raods for " + uber.getBetterRoads());
		uber.setDistance(150);
		System.out.println("Total distance " + uber.getDistance());
		uber.setTotalAmount(600);
		System.out.println("Total amount " + uber.getTotalAmount());
		uber.setGoogleMap("Hassan to bangalore");
		System.out.println("Roots " + uber.getGoogleMap());

	}

}
