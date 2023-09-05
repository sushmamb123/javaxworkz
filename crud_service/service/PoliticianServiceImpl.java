package com.xwork.crud.app.service;

import com.xwork.crud.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService{
	private PoliticianRepository politcianRepository;

	public PoliticianServiceImpl(PoliticianRepository politcianRepository) {
		this.politcianRepository = politcianRepository;
	}

	@Override
	public boolean validateExperience(String name) {
		System.out.println("invoking validateExperience from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Politician data is valid");
			this.politcianRepository.party("JDS");
		} else {
			System.out.println("Politician data invalid");
		}
		return false;
	}

}
