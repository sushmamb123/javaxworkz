package com.xworkz.scientist.service;

import com.xworkz.scientist.dto.ScientistDTO;

public class ScientistServiceImpl implements ScientistService {

	@Override
	public boolean validateAndSave(ScientistDTO dto) {
		System.out.println("Running in ScientistServiceImpl..");
		System.out.println("Running in dto:"+dto);
		return true;
	}

}
