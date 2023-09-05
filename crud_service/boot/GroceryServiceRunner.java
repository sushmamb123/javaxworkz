package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.GroceryRepository;
import com.xwork.crud.app.repository.GroceryRepositoryImpl;
import com.xwork.crud.app.service.GroceryService;
import com.xwork.crud.app.service.GroceryServiceImpl;

public class GroceryServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryServiceRunner");
		GroceryRepository groceryRepository = new GroceryRepositoryImpl();

		GroceryService grocryService = new GroceryServiceImpl(groceryRepository);
		grocryService.validateAndSave(null);
		grocryService.validateAndSave("Bread");
		grocryService.validateAndSave("");
	}

}
