package com.xworkz.validation.bean;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.validation.dto.InformationDTO;
@Component
@RequestMapping("/")
public class InfoComponenet {
	public InfoComponenet() {
		System.out.println("Created a infoComponent");
	}
	@RequestMapping("/info")
	public String infoComponenet(@Valid InformationDTO dto,BindingResult errors) {
		System.out.println(dto);
		System.out.println(errors.hasErrors());
		List<ObjectError> objectErrors=errors.getAllErrors();
		objectErrors.forEach(objectError->System.err.println(objectError.getObjectName()+":message"+objectError.getDefaultMessage()));
		return "Information";
	}

}
