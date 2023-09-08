package com.xwork.dto.boot;

import com.xwork.dto.app.WeatherDTO;
import com.xwork.dto.repository.app.WeatherRepository;
import com.xwork.dto.repository.app.WeatherRepositoryImpl;
import com.xwork.dto.service.appp.WeatherService;
import com.xwork.dto.service.appp.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WeatherRunner");
		WeatherRepository weather=new WeatherRepositoryImpl();
		WeatherService service=new WeatherServiceImpl(weather);
		WeatherDTO dto=new WeatherDTO("warm", "rainy", 50, false);
		boolean saved=service.validateAndSave(dto);
		System.out.println("persisted"+saved);
	}

}
