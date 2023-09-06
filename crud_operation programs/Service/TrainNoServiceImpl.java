package com.xwork.curd.application.app.Service;

import com.xwork.curd.application.app.Repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService{
	private TrainNoRepository trainNoRepository;

	public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
		this.trainNoRepository = trainNoRepository;
	}

	@Override
	public boolean validateAndStore(int trainNo) {
		System.out.println("Invoking validateAndStore in TrainNoServiceImpl" + this.getClass().getSimpleName());
		if (trainNo != 0) {
			System.out.println("Data is valid");
			if (!this.trainNoRepository.isExist(trainNo)) {
				this.trainNoRepository.save(trainNo);
				return true;
			} else {
				System.err.println("Train number " + trainNo + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}


}
