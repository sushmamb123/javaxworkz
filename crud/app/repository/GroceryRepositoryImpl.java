package com.xwork.crud.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private String[] grocery = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void save(String grocery) {
		System.out.println("invoking save in GroceryRepositoryImpl...");
		if (position < TOTAL_ITEMS) {
			this.grocery[position] = grocery;
			System.out.println("items" + grocery + " item position " + this.position);
			this.position++;

		} else {
			System.err.println("items is exceed more then grocery items");
		}

	}
		
		
	}
	


