package com.xwork.curd.application.app.Repository;

public interface CountryRepository {
	int TOTAL_ITEMS = 5;

	void store(String cname);

	default boolean isExist(String cname) {
		return false;

	}


}
