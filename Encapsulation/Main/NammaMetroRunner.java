package com.encapsulation.main;

import com.encapsulation.in.NammaMetro;

public class NammaMetroRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in NammaMetroRunner");

		NammaMetro metro = new NammaMetro();
		metro.setOwner("BMRCL");
		System.out.println("owner is :" + metro.getOwner());
		metro.setLocale("Bengaluru");
		System.out.println("locale is :" + metro.getLocale());
		metro.setTransitType("Rapid transit");
		System.out.println("transit type is :" + metro.getTransitType());
		metro.setLineColor("Purple");
		System.out.println("line color  is :" + metro.getLineColor());
		metro.setNumberOfStation(63);
		System.out.println("Number Of Station  is :" + metro.getNumberOfStation());
		metro.setdDailyRidership(703840l);
		System.out.println("Daily Ridership  is :" + metro.getDailyRidership());
		metro.setAnnualRidership(174.22);
		System.out.println("Annual Ridership in million  is :" + metro.getAnnualRidership());
		metro.setChiefExecutive("Anjum Parvez");
		System.out.println("ChiefExecutive  is :" + metro.getChiefExecutive());
		metro.setHeadQuaeters("BMTC complex Bengaluru");
		System.out.println("HeadQuaeters  is :" + metro.getHeadQuaeters());
		metro.setWebsite("bmtc.co.in");
		System.out.println("Website   is :" + metro.getWebsite());
		metro.setBeganOperation("20 October 2011");
		System.out.println(" Began Operation is :" + metro.getBeganOperation());
		metro.setTrainLength(6);
		System.out.println(" Train Length in coaches  is :" + metro.getTrainLength());
		metro.setAverageSpeed(35);
		System.out.println(" Average Speed is :" + metro.getAverageSpeed());
		metro.setTopSpeed(80);
		System.out.println("Top Speed is :" + metro.getTopSpeed());

	}

}
