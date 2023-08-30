package com.xwork.abstraction.boot;

import com.xwork.abstraction.app.Browser;
import com.xwork.abstraction.app.Internets;
import com.xwork.abstraction.interfa.Internet;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BrowserRunner");
		Internet internet = new Internets();
		Browser browser = new Browser();
		browser.setInternet(internet);
		browser.connect();
	}

}
