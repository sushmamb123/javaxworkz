package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.CrackerType;
import com.xworkz.cracker.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		CrackerDTO crackerDTO=new CrackerDTO(CrackerType.ATOM_BOMB);
		crackerDTO.setName("Lakshmi");
		crackerDTO.setPrice(250D);
		System.out.println(crackerDTO);

	}

}
