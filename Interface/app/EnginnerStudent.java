package com.xwork.inter.app;

import com.xwork.inter.Enginner;

public class EnginnerStudent implements Enginner {

	@Override
	public void attendance(int noOfClassAttend) {
		System.out.println("invoking attendance in EnginnerStudent");
	}

	@Override
	public String branch(String branchName) {
		System.out.println("invoking branch in EnginnerStudent");
		return null;
	}

	@Override
	public boolean regular() {
		System.out.println("invoking regular in EnginnerStudent");
		return false;
	}

}
