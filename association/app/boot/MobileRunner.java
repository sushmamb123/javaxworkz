package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Charger;
import com.xwork.farmer.app.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Mobilerunner");
		String name="IPhone";
		Charger charger=new Charger();
		Mobile mobile =new Mobile(name);
		mobile.setMobile(charger);
		mobile.msg();
		mobile.music();
		mobile.typing();
		mobile.call();
		
	}

}

