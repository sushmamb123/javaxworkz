package com.xwork.equal;

public class Kalla {
	private String name;
	private int age;
	private String character;
	private String identity;
	private String stop;
	private boolean goodPerson;

	public Kalla() {

	}

	public Kalla(String name, int age, String character, String identity, String stop, boolean goodPerson) {
		super();
		this.name = name;
		this.age = age;
		this.character = character;
		this.identity = identity;
		this.stop = stop;
		this.goodPerson = goodPerson;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", character=" + character + ", identity=" + identity + ", stop="
				+ stop + ", goodPerson=" + goodPerson;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Kalla");
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Kalla) {
				System.out.println("Object is instance of kalla");
				Kalla kal = (Kalla) obj;
				if (kal.name.equals(this.name) && kal.age == this.age && kal.character.equals(this.character)
						&& kal.identity.equals(this.identity) && kal.stop.equals(this.stop)&&kal.goodPerson==this.goodPerson) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not a instance of Kalla");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}
}
