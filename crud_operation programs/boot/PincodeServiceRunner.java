package com.xwork.curd.application.boot;

import com.xwork.curd.application.app.Repository.PincodeRepository;
import com.xwork.curd.application.app.Repository.PincodeRepositoryImpl;
import com.xwork.curd.application.app.Service.PincodeSerive;
import com.xwork.curd.application.app.Service.PincodeSeriveImpl;

public class PincodeServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PincodeServiceRunner");
		PincodeRepository pincode=new PincodeRepositoryImpl();
		PincodeSerive service=new PincodeSeriveImpl(pincode);
		service.valiDateAndSave(10025);
		service.valiDateAndSave(10025);
	}

}
