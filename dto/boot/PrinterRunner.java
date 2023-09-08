package com.xwork.dto.boot;

import com.xwork.dto.app.PrinterDTO;
import com.xwork.dto.repository.app.PrinterRepository;
import com.xwork.dto.repository.app.PrinterRepositoryImpl;
import com.xwork.dto.service.appp.PrinterService;
import com.xwork.dto.service.appp.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PrinterRunner");
		PrinterRepository repo = new PrinterRepositoryImpl();
		PrinterService service = new PrinterServiceImpl(repo);
		PrinterDTO dto = new PrinterDTO(10, "Laser", "speed", false);
		boolean saved = service.validateAndSave(dto);
		System.out.println("persisted" + saved);

	}

}
