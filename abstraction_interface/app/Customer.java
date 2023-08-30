package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.PassportVerification;

public class Customer {
	private PassportVerification verification;

	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in  in Customer");
		this.verification.verify();
	}

	public void setVerification(PassportVerification verification) {
		this.verification = verification;
	}

}
