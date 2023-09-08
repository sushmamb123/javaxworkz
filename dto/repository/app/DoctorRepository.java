package com.xwork.dto.repository.app;

import com.xwork.dto.app.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_ITEMS=10;
	void save(DoctorDTO dto);

}
