package com.xwork.crud.boot;

import com.xwork.crud.app.repository.HistoricalPlaceRepository;
import com.xwork.crud.app.repository.HistoricalPlaceRepositoryImpl;

public class HistoricalPlaceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HistoricalPlaceRunner");
		HistoricalPlaceRepository repo=new HistoricalPlaceRepositoryImpl();
		repo.visit(1);
		repo.visit(2);
		repo.visit(6);
		repo.visit(7);
		repo.visit(8);
		repo.visit(5);
		repo.visit(4);
		repo.visit(9);
		repo.visit(10);
		repo.visit(4);
		repo.visit(2);

	}

}
