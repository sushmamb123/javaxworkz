package com.example.castingchaining.main;

import com.casting.chaining.Mushroom;
import com.casting.chaining.PoisionMushroom;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MushroomKiller");
		
		Mushroom mushroom=new Mushroom("wood","skin",'M',false);
		System.out.println(mushroom.place);
		System.out.println(mushroom.color);
		System.out.println(mushroom.size);
		System.out.println(mushroom.eidible);
		
		System.out.println("******************************");
		Mushroom poisionMushroom=new PoisionMushroom();
		System.out.println(poisionMushroom.place);
		System.out.println(poisionMushroom.color);
		System.out.println(poisionMushroom.size);
		System.out.println(poisionMushroom.eidible);


		

	}

}
