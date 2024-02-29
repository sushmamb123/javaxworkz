package com.xworkz.generators.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.generators.dto.GeneratorDTO;
@Repository
public class GeneratorRepoImpl implements GeneratorRepo {
	public GeneratorRepoImpl() {
		System.out.println("Created a GeneratorRepoImpl..");
	}

	@Override
	public boolean saveAndValidate(GeneratorDTO dto) {
		System.out.println("Running in saveAndValidate in GeneratorRepoImpl..");
		return true;
	}

}
