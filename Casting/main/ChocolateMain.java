package com.example.casting.main;

import com.example.casting.ex3.CaramelChocolate;
import com.example.casting.ex3.Chocolate;
import com.example.casting.ex3.DarkChocolate;
import com.example.casting.util.ChocolateUtil;

public class ChocolateMain {

	public static void main(String[] args) {
		System.out.println("Running Main ...............");

		Chocolate chocolate=new Chocolate();

		DarkChocolate darkChocolate=new DarkChocolate();

		CaramelChocolate caramelChocolate=new CaramelChocolate();

		ChocolateUtil chocolateUtil=new ChocolateUtil();
		System.out.println("Calling run methods using chocolate ref");
		chocolateUtil.run(chocolate);	
		System.out.println("------------------------------------");

		ChocolateUtil chocolateUtil2=new ChocolateUtil();
		System.out.println("Calling run methods using DARK chocolate ref");
		chocolateUtil2.run(darkChocolate);	
		System.out.println("------------------------------------");

		ChocolateUtil chocolateUtil3=new ChocolateUtil();
		System.out.println("Calling run methods using CARAMEL chocolate ref");
		chocolateUtil3.run(caramelChocolate);	
		System.out.println("------------------------------------");


	}

 

	}


