package com.xwork.dto.repository.app;

import com.xwork.dto.app.VehicleDTO;

public class VehicleRepositoryImpl implements VehicleRepository {
	private VehicleDTO[] dtos = new VehicleDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(VehicleDTO dto) {
		System.out.println("Invoking save in VehicleRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

	@Override
	public boolean isExist(VehicleDTO dto) {
		System.out.println("Running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			VehicleDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("Data already exist");
				return true;
			}
		}
		return VehicleRepository.super.isExist(dto);
	}

	@Override
	public VehicleDTO findByName(String name) {
		System.out.println("Invoking findByName " + name);
		System.out.println("Current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			VehicleDTO dto = this.dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Dto found with name");
				return dto;
			}
		}
		return VehicleRepository.super.findByName(name);
	}

}
