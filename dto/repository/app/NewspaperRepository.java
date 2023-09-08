package com.xwork.dto.repository.app;

import com.xwork.dto.app.NewspaperDTO;

public interface NewspaperRepository {
	int TOTAL_ITEMS=10;
	void save(NewspaperDTO dto);

}
