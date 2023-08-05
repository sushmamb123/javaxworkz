package com.example.castingchaining.main;

import com.casting.chaining.GatewayRouter;
import com.casting.chaining.Router;

public class RouterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RouterRunner");
		Router router=new Router("Nortel","wiree",4,false);
		System.out.println(router.companies);
		System.out.println(router.type);
		System.out.println(router.ports);
		System.out.println(router.wifi);
		
		System.out.println("******************************");
		Router gatewayRouter=new GatewayRouter();
		System.out.println(gatewayRouter.companies);
		System.out.println(gatewayRouter.type);
		System.out.println(gatewayRouter.ports);
		System.out.println(gatewayRouter.wifi);


		

	}

}
