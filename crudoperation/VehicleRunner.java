package com.xwork.dto.boot;

import com.xwork.dto.app.VehicleDTO;
import com.xwork.dto.repository.app.VehicleRepository;
import com.xwork.dto.repository.app.VehicleRepositoryImpl;
import com.xwork.dto.service.appp.VehicleService;
import com.xwork.dto.service.appp.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in VehicleRunner");
		VehicleRepository repo = new VehicleRepositoryImpl();
		VehicleService service = new VehicleServiceImpl(repo);
		VehicleDTO dto = new VehicleDTO("omini", 10000, 200, "colour", 200, 1000, "fuel", 20, 30, "singapore");
		boolean persisted = service.validateAndSave(dto);
		System.out.println(persisted);
		VehicleDTO dto1 = service.findByName("omini");
		System.out.println("found" + dto1);

	}

}
