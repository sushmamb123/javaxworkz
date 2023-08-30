package com.xwork.abstraction.app;

import com.xwork.abstraction.interfa.Computer;

public class Program {
	private Computer computer;
	public void information() {
		System.out.println("invoking information() in Program");
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}

}
