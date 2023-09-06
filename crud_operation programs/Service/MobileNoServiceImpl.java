package com.xwork.curd.application.app.Service;

import com.xwork.curd.application.app.Repository.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService{
	private MobileNoRepository mobileNoRepository;

	public MobileNoServiceImpl(MobileNoRepository mobileNoRepository) {
		this.mobileNoRepository = mobileNoRepository;
	}

	@Override
	public boolean validateAndStore(long number) {
		System.out.println("Invoking validateAndStore in MobileNoServiceImpl" + this.getClass().getSimpleName());
		if (number != 0) {
			System.out.println("Data is valid");
			if (!this.mobileNoRepository.isExist(number)) {
				this.mobileNoRepository.storeContact(number);
				return true;
			} else {
				System.err.println("Mobile no " + number + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}

}
