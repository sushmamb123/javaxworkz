package com.xwork.crud.app.service;

import com.xwork.crud.app.repository.HistoricalPlaceRepository;

public class HistoricalPlaceServiceImpl implements HistoricalPlaceService{
	private HistoricalPlaceRepository historicalPlaceRepository;

	public HistoricalPlaceServiceImpl(HistoricalPlaceRepository historicalPlaceRepository) {
		this.historicalPlaceRepository = historicalPlaceRepository;
	}

	@Override
	public boolean validateHistory(String name) {
		System.out.println("invoking validateHistory from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Historical place data is valid");
			this.historicalPlaceRepository.visit(10);

		} else {
			System.out.println("Historical place data invalid");
		}

		return false;
	}

}
