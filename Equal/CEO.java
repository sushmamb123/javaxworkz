package com.xwork.equal;

public class CEO {
	private String things;
	private String personalities;
	private String functions;
	private int age;
	private double salary;
	private int experience;

	public CEO() {

	}

	public CEO(String things, String personalities, String functions, int age, double salary, int experience) {
		super();
		this.things = things;
		this.personalities = personalities;
		this.functions = functions;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Things:" + this.things + "Personalities:" + this.personalities + "Functions:" + this.functions + "Age:"
				+ this.age + "Salary:" + this.salary + "Experience:" + this.experience;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in CEO");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Minister) {
				System.out.println("Object is instance of ceo");
				CEO ceo = (CEO) obj;
				if (ceo.age == this.age && ceo.experience == this.experience) {
					System.out.println("object and properties are same");
					return false;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object and properties are same in ceo");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
