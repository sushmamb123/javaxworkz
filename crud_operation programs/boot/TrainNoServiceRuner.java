package com.xwork.curd.application.boot;

import com.xwork.curd.application.app.Repository.TrainNoRepository;
import com.xwork.curd.application.app.Repository.TrainNoRepositoryImpl;
import com.xwork.curd.application.app.Service.TrainNoService;
import com.xwork.curd.application.app.Service.TrainNoServiceImpl;

public class TrainNoServiceRuner {

	public static void main(String[] args) {
		System.out.println("invoking main in TrainNoServiceRuner");
		TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();
		TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
		boolean save = trainNoService.validateAndStore(12345);
		trainNoService.validateAndStore(98452);
		trainNoService.validateAndStore(98452);
	}

}
