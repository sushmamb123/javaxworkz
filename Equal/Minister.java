package com.xwork.equal;

public class Minister {
	private String types;
	private double salary;
	private int experience;
	private int duration;
	private String nameOfPerson;
	private String country;

	public Minister() {

	}

	public Minister(String types, double salary, int experience, int duration, String nameOfPerson, String country) {
		super();
		this.types = types;
		this.salary = salary;
		this.experience = experience;
		this.duration = duration;
		this.nameOfPerson = nameOfPerson;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Types:" + this.types + "Salary:" + this.salary + "Experience:" + this.experience + "Duration:"
				+ this.duration + "Name of person:" + this.nameOfPerson + "Country:" + this.country;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Minister");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Minister) {
				System.out.println("Object is instance of minister");
				Minister min = (Minister) obj;
				if (min.types.equals(this.types)) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of minister");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}
}
