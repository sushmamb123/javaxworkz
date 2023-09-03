package com.xwork.crud.boot;

import com.xwork.crud.app.repository.MedicineRepository;
import com.xwork.crud.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineRunner");
		MedicineRepository repo = new MedicineRepositoryImpl();
		repo.tablet("aspirian");
		repo.tablet("naproxen");
		repo.tablet("cymbalta");
		repo.tablet("alprazolam");
		repo.tablet("abacavir");
		repo.tablet("atorvastian");
		repo.tablet("diclofenac");
		repo.tablet("ibuprofen");
		repo.tablet("naproxen");
		repo.tablet("tylenol");

	}

}
