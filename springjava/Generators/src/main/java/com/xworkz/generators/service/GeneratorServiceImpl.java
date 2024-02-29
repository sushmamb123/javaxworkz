package com.xworkz.generators.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.generators.dto.GeneratorDTO;
import com.xworkz.generators.repo.GeneratorRepo;
@Service
public class GeneratorServiceImpl implements GeneratorService {
	@Autowired
	private GeneratorRepo repo;
	public GeneratorServiceImpl() {
		System.out.println("Created a GeneratorServiceImpl..");
	}

	@Override
	public boolean saveAndValidateGenerator(GeneratorDTO dto) {
		System.out.println("Running in saveAndValidateGenerator in GeneratorServiceImpl");	
		this.repo.saveAndValidate(dto);
		return true;
	}

}
