package com.xwork.dto.service.appp;

import com.xwork.dto.app.DoctorDTO;
import com.xwork.dto.repository.app.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		if (dto != null) {
			String name = dto.getName();
			String location = dto.getLocation();
			int cost = dto.getCost();
			long mobileNumber = dto.getMobileNumber();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
			}
			if (location != null && !location.isEmpty() && location.length() > 3 && location.length() <= 20) {
				System.out.println("location is valid");
			} else {
				System.err.println("location is invalid");
			}
			if (cost != 0 && cost >= 0) {
				System.out.println("cost is valid");
			} else {
				System.err.println("cost is invalid");
			}
			if (mobileNumber != 0 && mobileNumber >= 100) {
				System.out.println("mobileNumber is valid");
			} else {
				System.err.println("mobileNumber is invalid");
			}
			System.out.println("data is valid");
			this.doctorRepository.save(dto);
			return true;

		} else {
			System.err.println("data is invalid");
		}
		return false;
	}

}
