package com.xwork.curd.application.boot;

import com.xwork.curd.application.app.Repository.CountryRepository;
import com.xwork.curd.application.app.Repository.CountryRepositoryImpl;
import com.xwork.curd.application.app.Service.ContryService;
import com.xwork.curd.application.app.Service.ContryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CountryRunner");
		CountryRepository countryRepository = new CountryRepositoryImpl();
		ContryService countryService = new ContryServiceImpl(countryRepository);
		boolean store = countryService.validateAndStore("India");
		System.out.println(store);
		countryService.validateAndStore("India");
		countryService.validateAndStore("Australia");
	

	}

}
