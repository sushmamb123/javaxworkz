package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.PilotRepository;
import com.xwork.crud.app.repository.PilotRepositoryImpl;
import com.xwork.crud.app.service.PilotService;
import com.xwork.crud.app.service.PilotServiceImpl;

public class PilotServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotServiceRunner");
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		PilotService pilotService = new PilotServiceImpl(pilotRepository);
		pilotService.validateNavigation("Mysore");
	}
	}


