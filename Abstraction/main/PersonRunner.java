package com.xwork.abstraction.runner;

import com.xwork.abstractions.Person;
import com.xwork.abstractions.Teacher;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PersonRunner");
		Person person = new Teacher();
		person.name();
		person.age();
		person.excercise();
		person.grret();
		person.education();
		person.introduction();
		person.result();
		person.expectation();
		person.secure();
		person.future();
	}

}
