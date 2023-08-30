package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Speaker;

public class Computer implements Speaker {
	@Override
	public void sound() {
		System.out.println("invoking sound() in computer");

	}

}
