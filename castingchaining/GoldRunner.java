package com.example.castingchaining.main;

import com.casting.chaining.GiltGold;
import com.casting.chaining.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GoldRunner");
		Gold gold=new Gold("Ductile","White",79,"Solid");
		System.out.println(gold.facts);
		System.out.println(gold.color);
		System.out.println(gold.atomicNumber);
		System.out.println(gold.type);
		
		System.out.println("******************************");
		Gold giltGold=new GiltGold();
		System.out.println(giltGold.facts);
		System.out.println(giltGold.color);
		System.out.println(giltGold.atomicNumber);
		System.out.println(giltGold.type);




	}

}
