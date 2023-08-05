package com.casting.chaining;

public class ThreadRope extends Rope{
	public ThreadRope() {
		this("Pulling cars","Fibre",14.4f,600.0d);
		System.out.println("invoking with no-argument constructor in ThreadRope");
		
	}
	public ThreadRope(String use,String materials,float diameter,double price) {
		super("Pulling cars","Fibre",14.4f,600.0d);

		System.out.println("invoking with no-argument constructor in ThreadRope");

	}

}
