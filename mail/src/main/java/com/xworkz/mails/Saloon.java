package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	private Ajama ajama;
	@Autowired
	public Saloon(Ajama ajama) {
		this.ajama=ajama;
		System.out.println("created a Saloon:"+this.ajama);
	}

}
