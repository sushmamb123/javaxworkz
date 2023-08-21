package com.sush.method.run;

import java.nio.channels.Channel;

public class SystemRunner {

	public static void main(String[] args) {
		System system=new System();
		String ref = system.setProperty("jeevitha", "sushma");
		System.out.println(ref);
		String ref1 = system.mapLibraryName("butterffly");
		System.out.println(ref1);
		long ref2 = system.nanoTime();
		System.out.println(ref2);
		String ref3 = system.lineSeparator();
		Channel ref4 = system.inheritedChannel();
		System.out.println(ref4);
		boolean ref5 = system.equals(ref3);
		System.out.println(ref5);
		int ref6 = system.hashCode();
		System.out.println(ref6);
		Class ref7 = system.getClass();
		System.out.println(ref7);
		String ref8 = system.toString();
		System.out.println(ref8);
		system.wait();
	}
		
		

}
