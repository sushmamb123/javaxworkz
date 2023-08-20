package com.xwork.equal;

public class Cook {
	private String name;
	private int age;
	private String varities;
	private double cost;
	private String materials;
	private boolean taste;

	public Cook() {

	}

	public Cook(String name, int age, String varities, double cost, String materials, boolean taste) {
		super();
		this.name = name;
		this.age = age;
		this.varities = varities;
		this.cost = cost;
		this.materials = materials;
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", varities=" + varities + ", cost=" + cost + ", materials="
				+ materials + ", taste=" + taste;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Cook");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Cook) {
				System.out.println("Object is instance of cook");
				Cook c = (Cook) obj;
				if (c.name.equals(this.name) && c.taste == this.taste && c.age == this.age
						&& c.varities.equals(this.varities) && c.cost == this.cost) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not a instance of cook");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
