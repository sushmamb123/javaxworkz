package com.encapsulation.main;

import com.encapsulation.in.PhonePay;

public class PhonePayRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PhonePayRunner");
		PhonePay phonePay = new PhonePay();
		phonePay.setFullForm("Unified Payments Interface");
		System.out.println("FullForm is:" + phonePay.getFullForm());
		phonePay.setVesrion(1.6f);
		System.out.println("Vesion is:" + phonePay.getVersion());
		phonePay.setamount(1000);
		System.out.println("Amount is:" + phonePay.getamount());
		phonePay.setFeatures("Recharge Mobile");
		System.out.println("Features is:" + phonePay.getFeatures());
		phonePay.setUpdates(true);
		System.out.println("Updates is:" + phonePay.isUpdates());
		phonePay.setPrivacy(true);
		System.out.println("privacy is:" + phonePay.isPrivacy());
		phonePay.setAdvantage("Easy Transaction");
		System.out.println("Advantages is:" + phonePay.getAdvantage());
		phonePay.setNoOfUsers(100);
		System.out.println("Number of Users is:" + phonePay.getNoOfUsers());
		phonePay.setSafe(true);
		System.out.println("Phone Pay is Safe:" + phonePay.isSafe());
		phonePay.setMyNumber(1234567891L);
		System.out.println("My Number is:" + phonePay.getMyNumber());
		phonePay.setInventorYear(2015);
		System.out.println("Invented Year is:" + phonePay.getInventorYear());
		phonePay.setUserName("Chandhu");
		System.out.println("User Name is:" + phonePay.getUserName());
		phonePay.setPassword(true);
		System.out.println("Password is:" + phonePay.isPassword());
		phonePay.setInventor("Sameer Nigam");
		System.out.println("Inventor Name is:" + phonePay.getInventor());

	}




	}


