package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ajama {
	private Scissor scissor;
	@Autowired
	public Ajama(Scissor metal) {
		this.scissor=metal;
		System.out.println("Created a Ajama in:"+this.scissor);
	}

}
