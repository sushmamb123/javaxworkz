package com.casting.chaining;

public class GatewayRouter extends Router{
	public GatewayRouter() {
		this("Cisco","Wireless",4,true);
		System.out.println("invoking with no-argument constructor in GatewayRouter");
		
	}
	public GatewayRouter(String companies,String type,int ports,boolean wifi) {
		super("HP","wire",4,true);
		System.out.println("invoking with no-argument constructor in GatewayRouter");

	}

}
