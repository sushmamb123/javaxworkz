package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.HardWareDTO;
import com.xworkz.listdifset.dto.KnifeDTO;

public class KnifeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Knife runner..");
		KnifeDTO dto1=new KnifeDTO("Victorinox", "Stainless Steel", 10, 1.4f);
		KnifeDTO dto2=new KnifeDTO("Wusthof", "Carbon Steel", 20, 3.2f);
		KnifeDTO dto3=new KnifeDTO("Gerber", "Damascus Steel", 30,4.2f);
		KnifeDTO dto4=new KnifeDTO("Benchmade", "Ceramic", 40, 2.5f);
		KnifeDTO dto5=new KnifeDTO("Spyderco", "Titanium", 22, 1.5f);
		KnifeDTO dto6=new KnifeDTO("Cold Steel", "440C Stainless Steel", 15, 5.5f);
		KnifeDTO dto7=new KnifeDTO("Victorinox", "Stainless Steel", 10, 1.4f);
		
		Collection<KnifeDTO> collection=new HashSet<KnifeDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		
		System.out.println("total pins:"+collection.size());
		System.out.println(collection.stream().map(t -> t.getBrand()).collect(Collectors.toSet()).size());



	}

}