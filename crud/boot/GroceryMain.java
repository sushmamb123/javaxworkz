package com.xwork.crud.boot;

import com.xwork.crud.app.repository.GroceryRepository;
import com.xwork.crud.app.repository.GroceryRepositoryImpl;

public class GroceryMain {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryMain");
		GroceryRepository repo=new GroceryRepositoryImpl();
		repo.save("vegetables");
		repo.save("fruit");
		repo.save("biscuit");
		repo.save("rice");
		repo.save("chili");
		repo.save("butter");
		repo.save("curd");
		repo.save("tomoto");
		repo.save("sugar");
		repo.save("salt");
		repo.save("tumeric");
	}

}
