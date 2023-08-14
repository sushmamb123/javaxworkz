package com.xwork.abstractions;

public class Degree extends Education {
	@Override
	public void activities() {
		System.out.println("invoking activities in Degree");

	}

	@Override
	public boolean confidence() {
		System.out.println("invoking confidence in Degree");
		return false;
	}

	@Override
	public void exams() {
		System.out.println("invoking exams in Degree");

	}

	@Override
	public boolean result() {
		System.out.println("invoking result in Degree");
		return true;
	}

	@Override
	public boolean job() {
		System.out.println("invoking job in Degree");
		return true;
	}

	@Override
	public void Carrer() {
		System.out.println("invoking carrer in Degree");
		super.Carrer();
	}

	@Override
	public void college() {
		System.out.println("invoking college in Degree");
		super.college();
	}

	@Override
	public void destiny() {
		System.out.println("invoking destiny in Degree");
		super.destiny();
	}

	@Override
	public void primary() {
		System.out.println("invoking primary in Degree");
		super.primary();
	}

}
