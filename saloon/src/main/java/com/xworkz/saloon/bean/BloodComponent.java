package com.xworkz.saloon.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.saloon.dto.BloodGroupDTO;
@Component
@RequestMapping("/")
public class BloodComponent {
	public BloodComponent() {
		System.out.println("Running in BloodComponent...");
	}
	@RequestMapping("blood")
	public  String bloodComponent(BloodGroupDTO dto) {
		System.out.println("Running bloodcomponent :"+dto);
		return "BloodGroup.jsp";
	}

}
 