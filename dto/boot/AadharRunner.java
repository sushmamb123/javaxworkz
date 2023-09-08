package com.xwork.dto.boot;

import com.xwork.dto.app.AadharDTO;
import com.xwork.dto.repository.app.AadharRepository;
import com.xwork.dto.repository.app.AadharRepositoryImpl;
import com.xwork.dto.service.appp.AadharService;
import com.xwork.dto.service.appp.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AadharRunner");
		AadharRepository repo=new AadharRepositoryImpl();
		AadharService service=new AadharServiceImpl(repo);
		AadharDTO dto=new AadharDTO("Indian", 10001, 101, "sushma");
		boolean saved=service.validateAndSave(dto);
		System.out.println("persisted"+saved);
	}

}
