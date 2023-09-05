package com.xwork.crud.app.service;

import com.xwork.crud.app.repository.PilotRepository;

public class PilotServiceImpl implements PilotService{
	private PilotRepository pilotRepository;

	public PilotServiceImpl(PilotRepository pilotRepository) {
		this.pilotRepository = pilotRepository;
	}

	@Override
	public void validateNavigation(String name) {

		System.out.println("invoking validateNavigation from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Pilot data is valid");
			this.pilotRepository.fly("Aeroplane");
		} else {
			System.out.println("Pilot data invalid");
		}
	}
}
