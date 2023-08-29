package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Pant;
import com.xwork.farmer.app.Zip;

public class PantRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PantRunner");
		int size=28;
		Zip zip=new Zip();
		Pant pan=new Pant(size);
		pan.setPant(zip);
		pan.washing();

	}

}
