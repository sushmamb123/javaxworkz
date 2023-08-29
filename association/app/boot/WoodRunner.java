package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Paper;
import com.xwork.farmer.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WoodRunner");
		double price=5000;
		Paper paper=new Paper();
		Wood wood =new Wood(price);
		wood.setWood(paper);
		wood.polish();
	}

}
