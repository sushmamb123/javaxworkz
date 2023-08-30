package com.xwork.abstraction.boot;

import com.xwork.abstraction.app.Customer;
import com.xwork.abstraction.app.PassportVerifications;
import com.xwork.abstraction.interfa.PassportVerification;

public class CustomerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Customerrunner");
		PassportVerification verification=new PassportVerifications();
		Customer customer=new Customer();
		customer.setVerification(verification);
		customer.verifyCitizen();
		
	}

}
