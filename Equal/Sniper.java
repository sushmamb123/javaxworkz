package com.xwork.equal;

public class Sniper {
	private String characteristics;
	private String components;
	private int shoot;
	private int money;
	private double salary;
	private String sniperCalled;

	public Sniper() {

	}

	public Sniper(String characteristics, String components, int shoot, int money, double salary, String sniperCalled) {
		super();
		this.characteristics = characteristics;
		this.components = components;
		this.shoot = shoot;
		this.money = money;
		this.salary = salary;
		this.sniperCalled = sniperCalled;
	}

	@Override
	public String toString() {
		return "characteristics=" + characteristics + ", components=" + components + ", shoot=" + shoot + ", money="
				+ money + ", salary=" + salary + ", sniperCalled=" + sniperCalled;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Sniper");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Sniper) {
				System.out.println("Object is instance of minister");
				Sniper snip = (Sniper) obj;
				if (snip.shoot == this.shoot && snip.salary == this.salary
						&& snip.sniperCalled.equals(this.sniperCalled)) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of sniper");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
