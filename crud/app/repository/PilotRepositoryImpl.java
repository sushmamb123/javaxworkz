package com.xwork.crud.app.repository;

public class PilotRepositoryImpl implements PilotRepository {
	private String[] pilot = new String[TOTAL_NAME];
	private int position;

	@Override
	public void fly(String name) {
		System.out.println("invoking fly() in PilotRepositoryImpl");
		if (position < TOTAL_NAME) {
			this.pilot[position] = name;
			System.out.println("name:" + name + "name position" + this.position);
			this.position++;
		} else {
			System.err.println("out bound of name");
		}
	}

}
