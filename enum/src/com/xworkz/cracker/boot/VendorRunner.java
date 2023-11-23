package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.VendorGST;
import com.xworkz.cracker.constants.VendorSerialNo;
import com.xworkz.cracker.dto.VendorDTO;

public class VendorRunner {

	public static void main(String[] args) {
		VendorDTO dto=new VendorDTO("sushma", VendorGST.AMAZON, VendorSerialNo.AJIO);
		System.out.println(dto);
		
		System.out.println(VendorSerialNo.AJIO+" "+VendorSerialNo.AJIO.getSerialNo());
	}

}
