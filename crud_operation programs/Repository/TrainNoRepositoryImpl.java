package com.xwork.curd.application.app.Repository;

public class TrainNoRepositoryImpl implements TrainNoRepository{
	private int[] train = new int[TOTAL_TRAIN];
	private int position;

	@Override
	public void save(int trainNo) {
		System.out.println("Invoking storeNo in TrainNoRepositoryImpl");
		if (position < TOTAL_TRAIN) {
			this.train[position] = trainNo;
			System.out.println("Train number " + trainNo + " is at position " + this.position);
			this.position++;

		} else {
			System.err.println("Train is full connot store more data");
		}

	}

	@Override
	public boolean isExist(int tnumber) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.train[index];
			if (temp != 0 && temp == tnumber) {
				System.out.println("Number already exist..");
				return true;
			}
		}
		return TrainNoRepository.super.isExist(tnumber);
	}

}


