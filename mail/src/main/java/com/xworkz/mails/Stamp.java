package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stamp {
	private Bottle bottle;
	@Autowired
	public Stamp(Bottle bottle) {
		
		this.bottle=bottle;
		System.out.println("Created a bottle:"+this.bottle);
	}

}
