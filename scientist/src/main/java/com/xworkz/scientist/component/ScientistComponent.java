package com.xworkz.scientist.component;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.scientist.dto.ScientistDTO;
import com.xworkz.scientist.service.ScientistService;


@Controller
@RequestMapping("/")
public class ScientistComponent {
	@Autowired
	private ScientistService scientistService;

	public ScientistComponent() {
		System.out.println("Created ScientistController");
	}

	@PostMapping("/scientist")
	public String save(@Valid ScientistDTO dto, BindingResult errors, Model model) {
		System.out.println("Invoking learn().....");
		System.out.println("Is ScientistDTO is valid :" + errors.hasErrors());

		model.addAttribute("dto", dto);
		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(e -> System.err.println(e.getObjectName() + ":message " + e.getDefaultMessage()));
			model.addAttribute("errors", objectErrors);
			return "scientist";
	/*	} else {
			
			if (saved) {
				System.out.println("ScientistDTO:" + dto);
				model.addAttribute("msg", "Scientist details save successfully");
			} else {
				model.addAttribute("msg", "Scientist details not save successfully");
			}
		}*/
	}
		return "success";
}
}