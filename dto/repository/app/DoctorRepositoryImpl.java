package com.xwork.dto.repository.app;

import com.xwork.dto.app.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {
	private DoctorDTO[] dto = new DoctorDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(DoctorDTO dto) {
		if (position < TOTAL_ITEMS) {
			this.dto[position] = dto;
			System.out.println("dto" + dto + "items position" + this.position);
			this.position++;
		} else {
			System.out.println("storage is full");
		}

	}

}
