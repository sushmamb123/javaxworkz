package com.xwork.abstraction.boot;

import com.xwork.abstraction.app.BlueTooths;
import com.xwork.abstraction.app.Mobile;
import com.xwork.abstraction.interfa.BlueTooth;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileRunner");
		BlueTooth blue = new BlueTooths();
		Mobile mob = new Mobile();
		mob.setBlueTooth(blue);
		mob.calling();
	}

}
