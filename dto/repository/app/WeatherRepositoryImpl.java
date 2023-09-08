package com.xwork.dto.repository.app;

import com.xwork.dto.app.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository{
	private WeatherDTO[] dto=new WeatherDTO[TOTAL_ITEMS];
	private int position;
	@Override
	public void save(WeatherDTO dto) {
		System.out.println("invoking save() in WeatherRepositoryImpl");
		if(position<TOTAL_ITEMS) {
			this.dto[position]=dto;
			System.out.println("dto"+dto+"items position"+this.position);
			this.position++;
		}
		else {
			System.err.println("storage is full,please select other one");
		}
		
		
	}

}
