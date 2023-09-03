package com.xwork.crud.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	private String[] politician = new String[TOTAL_TEAM];
	private int position;

	@Override
	public void party(String name) {
		System.out.println("invoking party() in PoliticianRepository");
		if (position < TOTAL_TEAM) {
			this.politician[position] = name;
			System.out.println("team:" + name + "name position" + this.position);
			this.position++;
		} else {
			System.out.println("out of bounds");
		}

	}

}
