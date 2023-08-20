package com.xwork.equal.main;

import com.xwork.equal.Mechanic;

public class MechanicRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MehanicRunner");
		Mechanic mech = new Mechanic("Repair", "Communication");
		System.out.println(mech);
		Mechanic mech2 = new Mechanic("mech", "Problem Solving");
		System.out.println(mech2);
		System.out.println("****************************************");
		boolean same = mech.equals(mech2);
		System.out.println("Contents are same:" + same);

	}

}
