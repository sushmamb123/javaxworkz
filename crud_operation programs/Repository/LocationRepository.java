package com.xwork.curd.application.app.Repository;

public interface LocationRepository {
	int TOTAL_LOCATION=5;
	void save(String name);
	default boolean isExist(String name) {
		return false;
	}
	

}
