package com.xworkz.generators.service;

import com.xworkz.generators.dto.GeneratorDTO;

public interface GeneratorService {
	boolean saveAndValidateGenerator(GeneratorDTO dto);

}
