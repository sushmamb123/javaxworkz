package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.BlueTooth;

public class BlueTooths implements BlueTooth{
	@Override
	public void connection() {
		System.out.println("invoking connection() in BlueTooths");
	}

}
