package com.xwork.farmer.app.boot;

import com.xwork.farmer.app.Laptop;
import com.xwork.farmer.app.Trainer;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LaptopRunner");
		double salary = 10000;
		Laptop lap = new Laptop();
		Trainer train = new Trainer(salary);
		train.setLaptop(lap);
		train.teaching();

	}

}
