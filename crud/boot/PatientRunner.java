package com.xwork.crud.boot;

import com.xwork.crud.app.repository.PatientRepository;
import com.xwork.crud.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientRunner");
		PatientRepository repo=new PatientRepositoryImpl();
		repo.disease("cold");
		repo.disease("fever");
		repo.disease("headache");
		repo.disease("leg pain");
		repo.disease("malaria");
		repo.disease("dengu");
		repo.disease("astama");
		repo.disease("cancer");
		repo.disease("aids");
		repo.disease("tv");

	}

}
