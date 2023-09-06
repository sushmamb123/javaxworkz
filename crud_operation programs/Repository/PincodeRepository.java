package com.xwork.curd.application.app.Repository;

public interface PincodeRepository {
	int TOTAL_ITEMS = 5;

	void save(int pincode);

	default boolean isExist(int pincode) {
		return false;
	}

}
