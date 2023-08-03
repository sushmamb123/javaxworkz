package com.example.casting.main;

import com.example.casting.ex2.Browser;
import com.example.casting.ex2.Chrome;
import com.example.casting.ex2.Edge;
import com.example.casting.ex2.FireFox;
import com.example.casting.ex2.OperaBrowser;
import com.example.casting.util.BrowserUtil;

public class BrowserMain {

	public static void main(String[] args) {
		System.out.println("Running Maain Class.......");

		Browser browser=new Browser();

		Chrome chrome=new Chrome();

		Edge edge=new Edge();

		FireFox fireFox=new FireFox();

		OperaBrowser opera=new OperaBrowser();

		BrowserUtil browserUtil=new BrowserUtil();
		System.out.println("Calling run method with Browser ref");
		browserUtil.run(browser);
		System.out.println("--------------------------------------");

		BrowserUtil browserUtil2=new BrowserUtil();
		System.out.println("Calling run method with Chrome ref");
		browserUtil2.run(chrome);
		System.out.println("--------------------------------------");

		BrowserUtil browserUtil3=new BrowserUtil();
		System.out.println("Calling run method with Microsoft ref");
		browserUtil3.run(edge);
		System.out.println("--------------------------------------");

		BrowserUtil browserUtil4=new BrowserUtil();
		System.out.println("Calling run method with FireFox ref");
		browserUtil4.run(fireFox);
		System.out.println("--------------------------------------");

		BrowserUtil browserUtil5=new BrowserUtil();
		System.out.println("Calling run method with FireFox ref");
		browserUtil5.run(opera);


	}


	}


