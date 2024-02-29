package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	private Generator generator;
	@Autowired
	public Radio( Generator generator) {
		this.generator=generator;
		System.out.println("created a:"+this.generator);
		
	}

}
