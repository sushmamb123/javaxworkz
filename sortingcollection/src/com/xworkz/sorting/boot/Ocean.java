package com.xworkz.sorting.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sorting.dto.OceanDTO;

public class Ocean {

	public static void main(String[] args) {
		System.out.println("invoking in Ocean...");
		OceanDTO dto1=new OceanDTO("Indian Ocean", "Australia", 27.2f, 3.5f);
		OceanDTO dto2=new OceanDTO("Pacific Ocean", "Americas", 28.2f, 5.5f);
		OceanDTO dto3=new OceanDTO("Atlantic Ocean", "Antarctica", 29.2f, 9.5f);
		OceanDTO dto4=new OceanDTO("Southern Ocean", "Africa", 30.2f, 2.5f);
		OceanDTO dto5=new OceanDTO("Arctic Ocean", "South africa", 31.2f, 6.5f);
		Collection<OceanDTO> ocean=new ArrayList<OceanDTO>();
		ocean.add(dto1);
		ocean.add(dto2);
		ocean.add(dto3);
		ocean.add(dto4);
		ocean.add(dto5);
		
		System.out.println("Total ocean:"+ocean.size());
		for (OceanDTO oceanDTO : ocean) {
			System.out.println(oceanDTO);
		}
		System.out.println("***********************************************************");
		ocean.stream().sorted().forEach(oce->System.out.println(oce));


	}

}
