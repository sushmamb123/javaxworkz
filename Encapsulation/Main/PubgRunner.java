package com.encapsulation.main;

import com.encapsulation.in.Pubg;

public class PubgRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PubgRunner");
		Pubg pubG = new Pubg();
		pubG.setcolor("Backgroung Cream");
		System.out.println(pubG.getColor());
		pubG.setOS("64 bit windows 10");
		System.out.println(pubG.getColor());
		pubG.setCPU("AMD Ryzen");
		System.out.println(pubG.getCPU());
		pubG.setMemory(16);
		System.out.println(pubG.getMemory());
		pubG.setDirect(11.0f);
		System.out.println(pubG.getDirect());
		pubG.setStorage(512);
		System.out.println(pubG.getStorage());
		pubG.setNetwork("Broadband internet");
		System.out.println(pubG.getNetwork());
		pubG.setPlayers(5);
		System.out.println(pubG.getPlayers());
		pubG.setMatchType("Deathmatch");
		System.out.println(pubG.getMatchType());
		pubG.setNetSpeed(564.8);
		System.out.println(pubG.getNetSpeed());
		pubG.setTime(5);
		System.out.println(pubG.getTime());
		pubG.setWeapen("Gun");
		System.out.println(pubG.getWeapen());
		pubG.setProtection("Shield");
		System.out.println(pubG.getProtection());
		pubG.setNoOfLife(3);
		System.out.println(pubG.getNoOfLife());
	}

}
