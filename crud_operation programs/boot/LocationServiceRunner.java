package com.xwork.curd.application.boot;

import com.xwork.curd.application.app.Repository.LocationRepository;
import com.xwork.curd.application.app.Repository.LocationRepositoryImpl;
import com.xwork.curd.application.app.Service.LocationService;
import com.xwork.curd.application.app.Service.LocationServiceImpl;

public class LocationServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LocationServiceRunner");
		LocationRepository location=new LocationRepositoryImpl();
		LocationService service=new LocationServiceImpl(location);
		service.isExist("Bangalore");
		service.isExist("Bangalore");
	}

}
