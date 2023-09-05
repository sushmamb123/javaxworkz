package com.xwork.crud.app.service;

import com.xwork.crud.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;
	}

	@Override
	public boolean validateAndSave(String grocery) {
		if (grocery != null && !grocery.isEmpty() && grocery.length() > 3 && grocery.length() < 20) {
			System.out.println("Data is valid");
			this.groceryRepository.save(grocery);
		} else {
			System.err.println("Data is not valid");
		}
		return false;

	}

}
