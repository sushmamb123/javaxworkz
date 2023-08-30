package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Internet;

public class Internets implements Internet{
	@Override
	public void connect() {
		System.out.println("invpking connect() in Internets");		
	}

}
