package com.xwork.abstraction.boot;

import com.xwork.abstraction.app.Computer;
import com.xwork.abstraction.app.Laptop;
import com.xwork.abstraction.interfa.Speaker;

public class SpeakerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SpeakerRunner");
		Speaker speak=new Computer();
		Laptop lap=new Laptop();
		lap.setSpeaker(speak);
		lap.wifi();

	}

}
