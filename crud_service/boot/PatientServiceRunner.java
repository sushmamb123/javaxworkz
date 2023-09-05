package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.PatientRepository;
import com.xwork.crud.app.repository.PatientRepositoryImpl;
import com.xwork.crud.app.service.PatientService;
import com.xwork.crud.app.service.PatientServiceImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientServiceRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		PatientService patientService=new PatientServiceImpl(patientRepository);
		patientService.validPlace("RAN");
	}
		
	}


