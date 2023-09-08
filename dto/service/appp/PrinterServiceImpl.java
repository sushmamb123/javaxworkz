package com.xwork.dto.service.appp;

import com.xwork.dto.app.PrinterDTO;
import com.xwork.dto.repository.app.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		if (dto != null) {
			int speed = dto.getSpeed();
			String name = dto.getName();
			String features = dto.getFeatures();
			boolean use = dto.isUse();
			if (speed != 0 && speed >= 0) {
				System.out.println("speed is valid");
			} else {
				System.err.println("speed is invalid");

			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
			}
			if (features != null && !features.isEmpty() && features.length() > 3 && features.length() <= 20) {
				System.out.println("features is valid");
			} else {
				System.err.println("features is invalid");
			}
			if (!use == true && use == false) {
				System.out.println("use is valid");
			} else {
				System.err.println("use is invalid");
			}
			System.out.println("data is valid");
			this.printerRepository.save(dto);
			return true;

		} else {
			System.err.println("data is invalid");
		}

		return false;
	}

}
