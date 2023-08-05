package com.casting.chaining;

public class Router {
	public String companies;
	public String type;
	public int ports;
	public boolean wifi;
	
	public Router(String companies,String type,int ports,boolean wifi) {
		System.out.println("invoking with argument constructor in Router");
		this.companies=companies;
		this.type=type;
		this.ports=ports;
		this.wifi=wifi;
	}
}



