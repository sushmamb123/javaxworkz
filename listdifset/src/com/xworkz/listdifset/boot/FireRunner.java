package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.listdifset.dto.FireDTO;

public class FireRunner {

	public static void main(String[] args) {
		System.out.println("inviking main i fireRunner..");
		FireDTO  dto1=new FireDTO("Grass", 100, 10, "red");
		FireDTO  dto2=new FireDTO("grass-shrub", 80, 20, "carmine");
		FireDTO  dto3=new FireDTO("shrub", 90, 45, "orange");
		FireDTO  dto4=new FireDTO("timber", 110, 30, "yellow");
		FireDTO  dto5=new FireDTO("timber litter", 106, 20, "blue");
		FireDTO  dto6=new FireDTO("slash-blowdown", 102, 15, "white");
		FireDTO  dto7=new FireDTO("Grass", 100, 10, "red");
		
		Collection<FireDTO> collection=new HashSet<FireDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		
		System.out.println("Total fire:"+collection.size());


	}

}
