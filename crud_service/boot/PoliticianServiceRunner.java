package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.PoliticianRepository;
import com.xwork.crud.app.repository.PoliticianRepositoryImpl;
import com.xwork.crud.app.service.PoliticianService;
import com.xwork.crud.app.service.PoliticianServiceImpl;

public class PoliticianServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianServiceRunner");
		PoliticianRepository politcianRepository = new PoliticianRepositoryImpl();
		PoliticianService politicianService = new PoliticianServiceImpl(politcianRepository);
		politicianService.validateExperience("AND");

	}

}
