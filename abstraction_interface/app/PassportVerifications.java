package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.PassportVerification;

public class PassportVerifications implements PassportVerification{
	@Override
	public void verify() {
		System.out.println("invoking verify() in PassportVerification");
		
	}
	

}
