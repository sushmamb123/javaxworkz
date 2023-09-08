package com.xwork.dto.service.appp;

import com.xwork.dto.app.AadharDTO;
import com.xwork.dto.repository.app.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository=aadharRepository;

	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("dto" + dto + "items position" + this.getClass().getSimpleName());
		if (dto != null) {
			String citizen = dto.getCitizen();
			long aadharNumber = dto.getAadharNumber();
			int pincode = dto.getPincode();
			String name = dto.getName();
			if (citizen != null && !citizen.isEmpty() && citizen.length() > 3 && citizen.length() <= 20) {
				System.out.println("citizen is valid");
			} else {
				System.err.println("citizen is invalid");
			}
			if (aadharNumber != 0 && aadharNumber >= 10000) {
				System.out.println("aadharNumber is valid");
			} else {
				System.out.println("aadharNumber is invalid");
			}
			if (pincode != 0 && pincode >= 100) {
				System.out.println("pincode is valid");
			} else {
				System.err.println("pincode is not valid");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
			}
			System.out.println("data is valid");
			this.aadharRepository.save(dto);
			return true;
		} else {
			System.err.println("data is invalid");
		}

		return false;
	}

}
