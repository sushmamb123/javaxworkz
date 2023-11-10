package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.PinDTO;

public class PinRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in pin runner..");
		PinDTO dto1=new PinDTO("Flat headed pins", 1, 1.2f, "stell");
		PinDTO dto2=new PinDTO("Plastic head pins", 2, 2.2f, "copper");
		PinDTO dto3=new PinDTO("Glass headed pins", 3, 3.2f, "brass");
		PinDTO dto4=new PinDTO("Sharp pins", 4, 3.4f, "wood");
		PinDTO dto5=new PinDTO("Ballpoint pins", 5, 5.5f, "plastic");
		PinDTO dto6=new PinDTO("Dress making pins", 6, 6.2f, "gold");
		PinDTO dto7=new PinDTO("Flat headed pins", 1, 1.2f, "stell");
		
		Collection<PinDTO> collection=new HashSet<PinDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		
		System.out.println("total pins:"+collection.size());
		System.out.println(collection.stream().map(t -> t.getMaterial()).collect(Collectors.toSet()).size());



	}

}
