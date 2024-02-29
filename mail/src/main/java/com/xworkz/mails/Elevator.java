package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elevator {
	private Perfume perfume;
	@Autowired
	public Elevator(Perfume perfume) {
		this.perfume=perfume;
		System.out.println("Created a:"+this.perfume);
	}

}
