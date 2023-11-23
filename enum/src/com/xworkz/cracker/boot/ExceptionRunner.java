package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.ExceptionCode;
import com.xworkz.cracker.dto.ExceptionDTO;

public class ExceptionRunner {

	public static void main(String[] args) {
		ExceptionDTO dto=new ExceptionDTO(ExceptionCode.COMPILE_TIME, "public(Exception e)", "Hello Exception");
		System.out.println(dto);
		System.out.println(dto.getExceptionCode().getCode());
		System.out.println(dto.getExceptionCode().getMsg());
	}

}
