package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Speaker;

public class Laptop {
	private Speaker speaker;
	public void wifi() {
		System.out.println("invoking wifi() in Laptop");
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	

}
