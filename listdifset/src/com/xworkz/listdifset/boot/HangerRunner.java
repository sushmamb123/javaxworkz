package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.HangerDTO;

public class HangerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HangerRunner..");
		HangerDTO dto=new HangerDTO("yellow", "HappyToHang", "India", 159);
		HangerDTO dto2=new HangerDTO("yellow", "HappyToHang", "India", 159);
		HangerDTO dto3=new HangerDTO("Brown", "Bhagwati", "India", 180);
		HangerDTO dto4=new HangerDTO("Mint Granite blue", "Mahaware", "china", 109);
		HangerDTO dto5=new HangerDTO("silver", "Docoss", "India", 429);
		HangerDTO dto6=new HangerDTO("multiColor", "bhagwati", "India", 199);
		HangerDTO dto7=new HangerDTO("Stainless steel", "AToZ", "India", 299);
		
		Collection<HangerDTO> hanger=new HashSet<HangerDTO>();
		hanger.add(dto);
		hanger.add(dto2);
		hanger.add(dto3);
		hanger.add(dto4);
		hanger.add(dto5);
		hanger.add(dto6);
		hanger.add(dto7);
		
		System.out.println("total :"+hanger.size());
		
		System.out.println(hanger.stream().map(t -> t.getBrand()).collect(Collectors.toSet()).size());


	}

}
		
	


