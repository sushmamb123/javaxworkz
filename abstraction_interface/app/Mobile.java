package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.BlueTooth;

public class Mobile {
	private BlueTooth blueTooth;
	public void calling() {
		System.out.println("invoking calling() in Mobile");
	}
	public void setBlueTooth(BlueTooth blueTooth) {
		this.blueTooth = blueTooth;
	}
	

}
