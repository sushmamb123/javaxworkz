package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.HistoricalPlaceRepository;
import com.xwork.crud.app.repository.HistoricalPlaceRepositoryImpl;
import com.xwork.crud.app.service.HistoricalPlaceService;
import com.xwork.crud.app.service.HistoricalPlaceServiceImpl;

public class HistoricalPlaceServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HistoricalPlaceServiceRunner");
		HistoricalPlaceRepository historicalPlaceRepository=new HistoricalPlaceRepositoryImpl();
		HistoricalPlaceService historicalPlaceService=new HistoricalPlaceServiceImpl(historicalPlaceRepository);
		historicalPlaceService.validateHistory("Belur");
	}

	}


