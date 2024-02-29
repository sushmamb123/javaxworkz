package com.xworkz.generators.repo;

import com.xworkz.generators.dto.GeneratorDTO;

public interface GeneratorRepo {
	boolean saveAndValidate(GeneratorDTO dto);

}
