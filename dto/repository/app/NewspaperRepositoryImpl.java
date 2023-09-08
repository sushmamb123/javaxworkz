package com.xwork.dto.repository.app;

import com.xwork.dto.app.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {
	private NewspaperDTO[] dto = new NewspaperDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("invoking save() in NewspaperRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dto[position] = dto;
			System.out.println("dto" + dto + "items position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full");
		}

	}

}
