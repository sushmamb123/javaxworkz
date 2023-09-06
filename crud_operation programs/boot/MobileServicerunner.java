package com.xwork.curd.application.boot;

import com.xwork.curd.application.app.Repository.MobileNoRepository;
import com.xwork.curd.application.app.Repository.MobileNoRepositoryImpl;
import com.xwork.curd.application.app.Service.MobileNoService;
import com.xwork.curd.application.app.Service.MobileNoServiceImpl;

public class MobileServicerunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileServicerunner");
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
		MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
		boolean save=mobileNoService.validateAndStore(9880449303L);
		System.out.println(save);
		mobileNoService.validateAndStore(9845744735L);
		mobileNoService.validateAndStore(9611030155L);
	}

}
