package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	private Generator generator;
	private Tile tile;
	private Elevator elevator;
	@Autowired
	public Temple( Generator generator, Tile tile,Elevator elevator) {
		this.generator=generator;
		this.tile=tile;
		this.elevator=elevator;
		System.out.println("created a generator:"+this.generator+" "+this.tile+" "+this.elevator);
	}

}
