package com.xwork.dto.boot;

import com.xwork.dto.app.DoctorDTO;
import com.xwork.dto.repository.app.DoctorRepository;
import com.xwork.dto.repository.app.DoctorRepositoryImpl;
import com.xwork.dto.service.appp.DoctorService;
import com.xwork.dto.service.appp.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DoctorRunner");
		DoctorRepository repo=new DoctorRepositoryImpl();
		DoctorService service=new DoctorServiceImpl(repo);
		DoctorDTO dto=new DoctorDTO("sachin", "bangalore", 10, 108);
		boolean save=service.validateAndSave(dto);
		System.out.println("persisted"+save);
	}

}
