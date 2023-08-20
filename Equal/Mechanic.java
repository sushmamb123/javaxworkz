package com.xwork.equal;

public class Mechanic {
	private String role;
	private String types;
	private String skills;
	private String name;
	private int age;
	private int salary;

	public Mechanic() {

	}

	public Mechanic(String role, String types) {
		super();
		this.role = role;
		this.types = types;
		this.skills = skills;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "role=" + role + ", types=" + types + ", skills=" + skills + ", name=" + name + ", age=" + age
				+ ", salary=" + salary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Mechanic");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Mechanic) {
				System.out.println("Object is instance of Mechanic");
				Mechanic mech = (Mechanic) obj;
				if (mech.types.equals(this.types) && mech.age == this.age && mech.name.equals(this.name)
						&& mech.salary == this.salary) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of Mechanic");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
