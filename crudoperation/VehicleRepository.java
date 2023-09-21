package com.xwork.dto.repository.app;

import com.xwork.dto.app.VehicleDTO;

public interface VehicleRepository {
	int TOTAL_ITEMS = 5;

	void save(VehicleDTO dto);

	default boolean isExist(VehicleDTO dto) {
		return false;
	}

	default VehicleDTO findByName(String name) {
		return null;
	}

}
