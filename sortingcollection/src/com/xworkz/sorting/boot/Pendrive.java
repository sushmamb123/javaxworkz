package com.xworkz.sorting.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sorting.dto.PendriveDTO;


public class Pendrive {

	public static void main(String[] args) {
		PendriveDTO pendriveDTO1 = new PendriveDTO("16GB", ",sundisk", false, 100);
		PendriveDTO pendriveDTO2 = new PendriveDTO("64GB", ",hp", true, 250);
		PendriveDTO pendriveDTO3 = new PendriveDTO("128GB", "samsung", false, 800);
		PendriveDTO pendriveDTO4 = new PendriveDTO("256GB", ",Kingston", true, 700);
		PendriveDTO pendriveDTO5 = new PendriveDTO("1TGB", ",acer", false, 15);

		Collection<PendriveDTO> drive = new ArrayList<PendriveDTO>();
		drive.add(pendriveDTO1);
		drive.add(pendriveDTO2);
		drive.add(pendriveDTO3);
		drive.add(pendriveDTO4);
		drive.add(pendriveDTO5);

		System.out.println(drive.size());

		for (PendriveDTO pendriveDTO : drive) {
			System.out.println(pendriveDTO);

		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		drive.stream().sorted().forEach(d -> System.out.println(d));

	}

}
