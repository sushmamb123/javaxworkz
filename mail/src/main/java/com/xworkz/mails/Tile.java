package com.xworkz.mails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tile {
	private Perfume perfume;
	@Autowired
	public Tile( Perfume perfume) {
		this.perfume=perfume;
		System.out.println("Created a perfume:"+this.perfume);
	}

}
