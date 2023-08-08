package com.example.castingchaining.main;

import com.casting.chaining.Diamond;
import com.casting.chaining.JewelDiamond;

public class DiamondRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DiamondRunner");
		Diamond diamond=new Diamond("Black Diamond Minus White X","Clarity","Brown","Virgo");
		System.out.println(diamond.symbol);
		System.out.println(diamond.properties);
		System.out.println(diamond.color);
		System.out.println(diamond.nakshatra);
		
		System.out.println("******************************");
		Diamond jewelDiamond=new JewelDiamond();
		System.out.println(jewelDiamond.symbol);
		System.out.println(jewelDiamond.properties);
		System.out.println(jewelDiamond.color);
		System.out.println(jewelDiamond.nakshatra);



	}

}
