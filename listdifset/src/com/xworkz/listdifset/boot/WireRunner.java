package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.listdifset.dto.WireDTO;

public class WireRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WireRunner");
		WireDTO dto1 = new WireDTO("Power Cable", "Black", 3, 1000);
		WireDTO dto2 = new WireDTO("Ground Wire", "Red", 4, 9000);
		WireDTO dto3 = new WireDTO("Speaker Wire", "Green", 5, 3000);
		WireDTO dto4 = new WireDTO("Sensor Wire", "Bare Copper", 6, 8000);
		WireDTO dto5 = new WireDTO("Data Cable", "Blue", 7, 7000);
		WireDTO dto6 = new WireDTO("Thermostat Wire", "Yellow", 8, 3000);
		WireDTO dto7 = new WireDTO("Ground Wire", "Red", 4, 9000);

		Collection<WireDTO> collection = new HashSet<WireDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);

		System.out.println("Total wire:" + collection.size());

	}

}
