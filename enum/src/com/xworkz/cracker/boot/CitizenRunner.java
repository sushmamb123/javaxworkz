package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.CitizenLowerAge;
import com.xworkz.cracker.constants.CitizenUpperAge;
import com.xworkz.cracker.dto.CitizenTypeDTO;

public class CitizenRunner {

	public static void main(String[] args) {
		CitizenTypeDTO dto=new CitizenTypeDTO("sushma", CitizenLowerAge.AGE, CitizenUpperAge.SENIOR_CITIZEN);
		System.out.println(dto);
		System.out.println(CitizenUpperAge.SENIOR_CITIZEN+" "+CitizenLowerAge.SENIOR_CITIZEN.getLowerAge());

	}

}
