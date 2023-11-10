package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.listdifset.dto.HardWareDTO;
import com.xworkz.listdifset.dto.PinDTO;

public class HardWareRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in hardware runner..");
		HardWareDTO dto1=new HardWareDTO("Motherboard", "ASUS", 100, false);
		HardWareDTO dto2=new HardWareDTO("Hard Disk Drive", "NVIDIA Corporation", 200, false);
		HardWareDTO dto3=new HardWareDTO("Monitor", "Corsair", 3000, false);
		HardWareDTO dto4=new HardWareDTO("Keyboard", "Samsung", 4000, false);
		HardWareDTO dto5=new HardWareDTO("Mouse", "Seagate Technology", 5000, false);
		HardWareDTO dto6=new HardWareDTO("Printer", "Intel Corporation", 600, false);
		HardWareDTO dto7=new HardWareDTO("Motherboard", "ASUS", 100, false);
		Collection<HardWareDTO> collection=new HashSet<HardWareDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		
		System.out.println("total pins:"+collection.size());
		System.out.println(collection.stream().map(t -> t.getManufacture()).collect(Collectors.toSet()).size());



	}

}
