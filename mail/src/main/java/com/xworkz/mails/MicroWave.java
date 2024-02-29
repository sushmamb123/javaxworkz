package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MicroWave {
	private Bulb bulb;
	private Radio radio;
	@Autowired
	public MicroWave( Bulb bulb, Radio radio) {
		this.bulb=bulb;
		this.radio=radio;
		System.out.println("Created a:"+this.bulb+" "+this.radio);
	}

}
