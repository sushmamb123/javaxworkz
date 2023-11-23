package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.ShoeType;
import com.xworkz.cracker.dto.ShoeDTO;

public class ShoeRunner {

	public static void main(String[] args) {
		ShoeDTO dto=new ShoeDTO(ShoeType.BOOT);
		dto.setBrand("Addidas");
		dto.setCost(1000D);
		System.out.println(dto);
	}

}
