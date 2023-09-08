package com.xwork.dto.service.appp;

import com.xwork.dto.app.WeatherDTO;
import com.xwork.dto.repository.app.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		if (dto != null) {
			String components = dto.getComponents();
			String types = dto.getTypes();
			int temperature = dto.getTemperature();
			boolean condition = dto.isCondition();
			if (components != null && !components.isEmpty() && components.length() > 3 && components.length() <= 20) {
				System.out.println("components is valid");
			} else {
				System.err.println("components is invalid");
			}
			if (types != null && !types.isEmpty() && types.length() > 3 && types.length() <= 20) {
				System.out.println("types is valid");
			} else {
				System.err.println("types is invalid");
			}
			if (temperature != 0 && temperature >= 10) {
				System.out.println("temperature is valid");
			} else {
				System.err.println("temperature is invalid");
			}
			if (condition == true && condition == false) {
				System.out.println("condition is valid");
			} else {
				System.err.println("condition is invalid");
			}
			System.out.println("Data is valid");
			this.weatherRepository.save(dto);
			return true;
		} else {
			System.out.println("Data is invalid");
		}
		return false;
	}

}
