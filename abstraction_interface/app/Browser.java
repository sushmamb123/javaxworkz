package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("invoking calling() in Browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

}
