package com.encapsulation.main;

import com.encapsulation.in.RedBus;

public class RedBusRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RedBusRunner");
		RedBus redBus = new RedBus();
		redBus.setTransport("in bus");
		System.out.println("transport in " + redBus.getTransport());
		redBus.setSize("Long");
		System.out.println("Size is " + redBus.getSize());
		redBus.setbodySize("Long");
		System.out.println("Body size " + redBus.getbodySize());
		redBus.setNoOfSeats(60);
		System.out.println("Total no of seats " + redBus.getNoOfSeats());
		redBus.setNoOfBenches(10);
		System.out.println("Total no of seats " + redBus.getNoOfBenches());
		redBus.setTarget("Bangalore");
		System.out.println("Target is " + redBus.getTarget());
		redBus.setTicketBooking("online mode");
		System.out.println("get ticket booking in " + redBus.getTicketBooking());
		redBus.setOnlineBooking("online booking for reservation");
		System.out.println("get ticket booking in " + redBus.getOnlineBooking());
		redBus.setNoOfPassengers(60);
		System.out.println("Total no of Passenger " + redBus.getNoOfPassengers());
		redBus.setBetterRoads("For smooth traveling");
		System.out.println("Get betterr raods for " + redBus.getBetterRoads());
		redBus.setDistance(150);
		System.out.println("Total distance " + redBus.getDistance());
		redBus.setTotalAmount(500);
		System.out.println("Total amount " + redBus.getTotalAmount());
		redBus.setGoogleMap("Hassan to bangalore");
		System.out.println("Roots " + redBus.getGoogleMap());

	}

}
