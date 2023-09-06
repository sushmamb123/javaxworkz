package com.xwork.curd.application.app.Repository;

public interface TrainNoRepository {
	int TOTAL_TRAIN=10;
	void save(int trainNo);
	default boolean isExist(int trainNo) {
		return false;
	}
	

}
