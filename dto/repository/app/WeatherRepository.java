package com.xwork.dto.repository.app;

import com.xwork.dto.app.WeatherDTO;

public interface WeatherRepository {
	int TOTAL_ITEMS=5;
	void save(WeatherDTO dto);

}
