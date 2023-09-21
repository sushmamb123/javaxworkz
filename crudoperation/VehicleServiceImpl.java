package com.xwork.dto.service.appp;

import com.xwork.dto.app.VehicleDTO;
import com.xwork.dto.repository.app.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public boolean validateAndSave(VehicleDTO dto) {
		if (dto != null) {
			String name = dto.getName();
			double cost = dto.getCost();
			float weight = dto.getWeight();
			String properties = dto.getProperties();
			float engineCapacity = dto.getEngineCapacity();
			int cc = dto.getCc();
			String types = dto.getTypes();
			int length = dto.getLength();
			int width = dto.getWidth();
			String country = dto.getCountry();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}
			if (cost != 0 && cost > 1000) {
				System.out.println("cost is valid");
			} else {
				System.err.println("cost is invalid");
			}
			if (weight != 0 && weight > 100) {
				System.out.println("weight is valid");
			} else {
				System.err.println("weight is invalid");
			}
			if (properties != null && !properties.isEmpty() && properties.length() > 3 && properties.length() <= 20) {
				System.out.println("properties is valid");
			} else {
				System.err.println("properties is invalid");
				return false;
			}
			if (engineCapacity != 0 && engineCapacity > 100) {
				System.out.println("engineCapacity is valid");
			} else {
				System.err.println("engineCapacity is invalid");
			}
			if (cc != 0 && cc > 100) {
				System.out.println("cc is valid");
			} else {
				System.err.println("cc is invalid");
			}
			if (types != null && !types.isEmpty() && types.length() > 3 && types.length() <= 20) {
				System.out.println("types is valid");
			} else {
				System.err.println("types is invalid");
				return false;
			}
			if (length != 0 && length > 10) {
				System.out.println("length is valid");
			} else {
				System.err.println("length is invalid");
			}
			if (width != 0 && width > 10) {
				System.out.println("width is valid");
			} else {
				System.err.println("width is invalid");
			}
			if (country != null && !country.isEmpty() && country.length() > 3 && country.length() <= 20) {
				System.out.println("country is valid");
			} else {
				System.err.println("country is invalid");
				return false;
			}
			System.out.println("Data is valid");
			boolean exist = vehicleRepository.isExist(dto);
			if (!exist) {
				this.vehicleRepository.save(dto);
			} else {
				System.err.println("dto is alreday exists");
			}

			return true;
		} else {
			System.err.println("Data invalid");
		}
		return false;
	}

	@Override
	public VehicleDTO findByName(String name) {
		System.out.println("Invoking findByName " + name);
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Name is valid");
			VehicleDTO dto = this.vehicleRepository.findByName(name);
			return dto;
		} else {
			System.err.println("Name is invalid");
		}
		return VehicleService.super.findByName(name);
	}

}
