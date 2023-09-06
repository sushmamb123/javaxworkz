package com.xwork.curd.application.app.Service;

import com.xwork.curd.application.app.Repository.PincodeRepository;

public class PincodeSeriveImpl implements PincodeSerive{
	private PincodeRepository pincodeReppository;
	public PincodeSeriveImpl(PincodeRepository pincodeReppository) {
		this.pincodeReppository=pincodeReppository;
	}
	@Override
	public boolean valiDateAndSave(int pincode) {
		System.out.println("invoking valiDateAndSave() in PincodeSeriveImpl"+this.getClass().getSimpleName());
		if(pincode>=10000&& pincode<=99999) {
			if(!this.pincodeReppository.isExist(pincode)) {
				this.pincodeReppository.save(pincode);
				return true;
			}
			else {
				System.out.println("pincode is already exist ,pick for another one");
			}
			
		}
		else {
			System.out.println("pincode is invalid cannot store");
		}
		return false;
	}

}
