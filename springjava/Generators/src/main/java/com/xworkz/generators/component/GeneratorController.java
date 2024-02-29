package com.xworkz.generators.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.generators.dto.GeneratorDTO;
import com.xworkz.generators.service.GeneratorService;

@Controller
@RequestMapping("/")
public class GeneratorController {
	@Autowired
	private GeneratorService service;
	public GeneratorController() {
		System.out.println("created a GeneratorController..");
	}
	@PostMapping("/sound")
	public String save(@Valid GeneratorDTO dto,BindingResult result,Model model) {
		System.out.println("Details of generator:"+dto);
		System.out.println("Details of DTO error:"+result.hasErrors());
		model.addAttribute("dto", dto);
		if(result.hasErrors()) {
			List<ObjectError> objectErrors=result.getAllErrors();
			objectErrors.forEach(a->System.err.println(a.getObjectName()+" "+a.getDefaultMessage()));
			model.addAttribute("errors", objectErrors);
			model.addAttribute("errorMsg", "Details can't save..");
			return "Generator";
		}
		else {
		boolean saves=	this.service.saveAndValidateGenerator(dto);
		if(saves) {
			System.out.println("DTO saved:"+saves);
			model.addAttribute("noError", "Details saved Successfully..");
		}
		
		return "GeneratorSuccess";
		}
		
		
	}

}
