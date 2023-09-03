package com.xwork.crud.boot;

import com.xwork.crud.app.repository.JacketRepository;
import com.xwork.crud.app.repository.JacketRepositoryImpl;

public class JacketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketRunner");	
		JacketRepository rep=new JacketRepositoryImpl();
		rep.colour("red");
		rep.colour("white");
		rep.colour("blue");
		rep.colour("pink");
		rep.colour("orange");
		rep.colour("dark blue");
		rep.colour("yellow");
		rep.colour("violet");
		rep.colour("purple");
		rep.colour("green");

	}
	

}
