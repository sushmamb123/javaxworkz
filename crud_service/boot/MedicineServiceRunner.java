package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.MedicineRepository;
import com.xwork.crud.app.repository.MedicineRepositoryImpl;
import com.xwork.crud.app.service.MedicineService;
import com.xwork.crud.app.service.MedicineServiceImpl;

public class MedicineServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineServiceRunner");
		MedicineRepository medicineRepository = new MedicineRepositoryImpl();
		MedicineService medicineService = new MedicineServiceImpl(medicineRepository);
		medicineService.validateName("Cipla");

	}

}
