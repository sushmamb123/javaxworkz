package com.encapsulation.main;

import com.encapsulation.in.NammaYatri;

public class NammaYatriRunner {

	public static void main(String[] args) {
		NammaYatri nammaYathri = new NammaYatri();
		System.out.println("invoking main in nammaYathri killer");

		nammaYathri.setTransport("in bus");
		System.out.println("transport in " + nammaYathri.getTransport());
		nammaYathri.setSize("Long");
		System.out.println("Size is " + nammaYathri.getSize());
		nammaYathri.setAuto("Auto");
		System.out.println("Book  " + nammaYathri.getAuto());
		nammaYathri.setNoOfSeats(4);
		System.out.println("Total no of seats " + nammaYathri.getNoOfSeats());
		nammaYathri.setBike("Rapido");
		System.out.println("Total no of seats " + nammaYathri.getBike());
		nammaYathri.setTarget("Bangalore");
		System.out.println("Target is " + nammaYathri.getTarget());
		nammaYathri.setCar("Car");
		System.out.println("get booking in " + nammaYathri.getCar());
		nammaYathri.setOnlineBooking("online booking for reservation");
		System.out.println("get ticket booking in " + nammaYathri.getOnlineBooking());
		nammaYathri.setNoOfPassengers(4);
		System.out.println("Total no of Passenger " + nammaYathri.getNoOfPassengers());
		nammaYathri.setBetterRoads("For smooth traveling");
		System.out.println("Get betterr raods for " + nammaYathri.getBetterRoads());
		nammaYathri.setDistance(10);
		System.out.println("Total distance " + nammaYathri.getDistance());
		nammaYathri.setTotalAmount(600);
		System.out.println("Total amount " + nammaYathri.getTotalAmount());
		nammaYathri.setGoogleMap("mejestic to rajaji nagar");
		System.out.println("Roots " + nammaYathri.getGoogleMap());
	}
}
