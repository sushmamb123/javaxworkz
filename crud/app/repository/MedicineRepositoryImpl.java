package com.xwork.crud.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository {
	private String[] medicine = new String[TOTAL_MEDICINE];
	private int position;

	@Override
	public void tablet(String name) {
		System.out.println("invoking tablet() in MedicineRepositoryImpl");
		if (position < TOTAL_MEDICINE) {
			this.medicine[position] = name;
			System.out.println("name:" + name + "name position" + this.position);
			this.position++;
		} else {
			System.err.println("out of bound exception");
		}

	}

}
