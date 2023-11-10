package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.listdifset.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Cracker runner.....");
		CrackerDTO crackerDTO1=new CrackerDTO("Sparkless", "red", 1f, 1.2f);
		CrackerDTO crackerDTO2=new CrackerDTO("Flower pots", "orange", 2f, 1.3f);
		CrackerDTO crackerDTO3=new CrackerDTO("Rockets", "yellow", 3f, 1.4f);
		CrackerDTO crackerDTO4=new CrackerDTO("Twinkling stars", "green", 4f, 1.5f);
		CrackerDTO crackerDTO5=new CrackerDTO("pencils", "pink", 5f, 1.6f);
		CrackerDTO crackerDTO6=new CrackerDTO("Sparkless", "red", 1f, 1.2f);
		CrackerDTO crackerDTO7=new CrackerDTO("Sparkless", "red", 1f, 1.2f);
		
		Collection<CrackerDTO> collection=new HashSet<CrackerDTO>();
		collection.add(crackerDTO1);
		collection.add(crackerDTO2);
		collection.add(crackerDTO3);
		collection.add(crackerDTO4);
		collection.add(crackerDTO5);
		collection.add(crackerDTO6);
		collection.add(crackerDTO7);
		
		System.out.println("Total crackers:"+collection.size());


	}

}
