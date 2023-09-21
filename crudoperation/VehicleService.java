package com.xwork.dto.service.appp;

import com.xwork.dto.app.VehicleDTO;

public interface VehicleService {
	boolean validateAndSave(VehicleDTO dto);

	default boolean isExist(VehicleDTO dto) {
		return false;

	}

	default VehicleDTO findByName(String name) {
		return null;

	}

}
