package com.xworkz.camera.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickCommand {
	public ClickCommand() {
		System.out.println("Created a click cammand");
	}
	@RequestMapping("/click")
	public String onclick() {
		System.out.println("Created a method onclick..");
		return "index.jsp";
	}

}
