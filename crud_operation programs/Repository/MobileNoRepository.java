package com.xwork.curd.application.app.Repository;

public interface MobileNoRepository {
	int TOTAL_ITEMS = 5;

	void storeContact(long number);

	default boolean isExist(long number) {
		return false;
	}

}
