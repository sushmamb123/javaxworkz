package com.xwork.curd.application.app.Service;

import com.xwork.curd.application.app.Repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean isExist(String name) {
		System.out.println("invoking isExist in LocationServiceImpl" + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() <= 20) {
			if (!this.locationRepository.isExist(name)) {

				this.locationRepository.save(name);
				System.out.println("data is valid");
				return true;
			} else {
				System.err.println("data is already stored please store another one");
			}
		} else {
			System.err.println("data is invalid");
		}

		return false;
	}

}
