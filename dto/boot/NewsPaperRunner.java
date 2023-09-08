package com.xwork.dto.boot;

import com.xwork.dto.app.NewspaperDTO;
import com.xwork.dto.repository.app.NewspaperRepository;
import com.xwork.dto.repository.app.NewspaperRepositoryImpl;
import com.xwork.dto.service.appp.NewspaperService;
import com.xwork.dto.service.appp.NewspaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in NewsPaperRunner");
		NewspaperRepository newspaper = new NewspaperRepositoryImpl();
		NewspaperService service = new NewspaperServiceImpl(newspaper);
		NewspaperDTO dto = new NewspaperDTO("sush", "kannada", 20, 2000);
		boolean saved = service.validateAndSave(dto);
		System.out.println("persisted = " + saved);
	}

}
