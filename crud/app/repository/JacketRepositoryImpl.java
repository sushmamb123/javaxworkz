package com.xwork.crud.app.repository;

public class JacketRepositoryImpl implements JacketRepository {
	private String[] jacket = new String[TOTAL_JACKET];
	private int position;

	@Override
	public void colour(String name) {
		System.out.println("invoking colour() in JacketRepository..");
		if (position < TOTAL_JACKET) {
			this.jacket[position] = name;
			System.out.println("jacket" + name + " jacket position " + this.position);
			this.position++;

		} else {
			System.err.println("items is exceed more then jacket");
		}

	}
}
