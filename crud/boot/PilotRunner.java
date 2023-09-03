package com.xwork.crud.boot;

import com.xwork.crud.app.repository.PilotRepository;
import com.xwork.crud.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotRunner");
		PilotRepository repo = new PilotRepositoryImpl();
		repo.fly("chuck yeager");
		repo.fly("charles");
		repo.fly("amelia");
		repo.fly("jimmy");
		repo.fly("bob hoover");
		repo.fly("richard");
		repo.fly("howard");
		repo.fly("tony");
		repo.fly("otto");
		repo.fly("buzz");
		repo.fly("amelia");
		repo.fly("manfred");

	}

}
