package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Computer;

public class Computers implements Computer{
	@Override
	public void information() {
		System.out.println("invoking information() in Computers");
	}
	

}
