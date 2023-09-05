package com.xwork.crud.service.boot;

import com.xwork.crud.app.repository.JacketRepository;
import com.xwork.crud.app.repository.JacketRepositoryImpl;
import com.xwork.crud.app.service.JacketService;
import com.xwork.crud.app.service.JacketServiceImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketServiceRunner");
		JacketRepository jacketRepsitory = new JacketRepositoryImpl();
		JacketService jacketService = new JacketServiceImpl(jacketRepsitory);
		jacketService.validateBrand("Puma");
	}

}
