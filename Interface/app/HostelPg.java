package com.xwork.inter.app;

import com.xwork.inter.PG;

public class HostelPg implements PG {

	@Override
	public String name(String pgName) {
		System.out.println("invoking String name in HostelPg");
		return null;
	}

	@Override
	public double payment(double cost) {
		System.out.println("invoking payment in HostelPg");
		return 0;
	}

	@Override
	public boolean food(boolean taste) {
		System.out.println("invoking food in HostelPg");
		return false;
	}

}
