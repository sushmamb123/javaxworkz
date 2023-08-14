package com.xwork.abstractions;

public class Teacher extends Person {
	@Override
	public void name() {
		System.out.println("invoking name in Teacher");
		super.name();
	}

	@Override
	public void grret() {
		System.out.println("invoking greet in Teacher");
		super.grret();
	}

	@Override
	public void age() {
		System.out.println("invoking age in Teacher");
		super.age();
	}

	@Override
	public void education() {
		System.out.println("invoking education in Teacher");
		super.education();
	}

	@Override
	public void excercise() {
		System.out.println("invoking excersise in Teacher");
		super.excercise();
	}

	@Override
	public boolean introduction() {
		System.out.println("invoking introduction in Teacher");
		return false;
	}

	@Override
	public boolean result() {
		System.out.println("invoking result in Teacher");
		return false;
	}

	@Override
	public void expectation() {
		System.out.println("invoking expectation in Teacher");

	}

	@Override
	public void secure() {
		System.out.println("invoking secure in Teacher");

	}

	@Override
	public void future() {
		System.out.println("invoking future in Teacher");

	}

}
