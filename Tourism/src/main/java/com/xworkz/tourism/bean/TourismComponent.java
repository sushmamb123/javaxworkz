package com.xworkz.tourism.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.tourism.dto.TourismDTO;

@Component
@RequestMapping("/")
public class TourismComponent {
	public TourismComponent() {
		System.out.println("Created a TourismComponent...");
	}
	@RequestMapping("/tour")
	public String tourismComponent(TourismDTO dto) {
		System.out.println(dto);
		return "Tourism.jsp";
	}

}
