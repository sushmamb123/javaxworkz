package com.example.castingchaining.main;

import com.casting.chaining.Coffee;
import com.casting.chaining.ColdCoffee;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CoffeeRunner");
		Coffee coffee=new Coffee("Nescafe",10,40.0d,false);
		System.out.println(coffee.brand);
		System.out.println(coffee.quantity);
		System.out.println(coffee.price);
		System.out.println(coffee.tasty);
		
		System.out.println("******************************");
		Coffee coldCoffee=new ColdCoffee();
		System.out.println(coldCoffee.brand);
		System.out.println(coldCoffee.quantity);
		System.out.println(coldCoffee.price);
		System.out.println(coldCoffee.tasty);



	}

}
