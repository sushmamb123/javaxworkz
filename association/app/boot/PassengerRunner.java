package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Bus;
import com.xwork.farmer.app.Passenger;

public class PassengerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PassengerRunner");
		int age = 25;
		Bus bus = new Bus();
		Passenger pass = new Passenger(age);
		pass.setPassenger(bus);
		pass.travelling();
	}

}
