package com.xwork.crud.app.repository;

public class ArtistRepositorympl implements ArtistRepository {
	private String[] artist = new String[TOTAL_ARTIST];
	private int position;

	@Override
	public void makeup(String name) {
		System.out.println("invoking makeup() in ArtistRepository");
		if (position < TOTAL_ARTIST) {
			this.artist[position] = name;
			System.out.println("name:"+ name + " name position " + this.position);
			this.position++;

		} else {
			System.err.println("items is exceed more then artist");
		}

	}
}
