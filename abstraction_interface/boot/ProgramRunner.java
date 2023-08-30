package com.xwork.abstraction.boot;

import com.xwork.abstraction.app.Computers;
import com.xwork.abstraction.app.Program;
import com.xwork.abstraction.interfa.Computer;

public class ProgramRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ProgramRunner");
		Computer computer=new Computers();
		Program program=new Program();
		program.setComputer(computer);
		program.information();
	}

}
