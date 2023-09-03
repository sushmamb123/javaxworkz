package com.xwork.crud.boot;

import com.xwork.crud.app.repository.PoliticianRepository;
import com.xwork.crud.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianRunner");
		PoliticianRepository repo = new PoliticianRepositoryImpl();
		repo.party("jds");
		repo.party("bjp");
		repo.party("congress");
		repo.party("others");
		repo.party("bharatiya");
		repo.party("bahujan");
		repo.party("national congress");
		repo.party("Bsp");
		repo.party("samaj");
		repo.party("janatha");

	}

}
