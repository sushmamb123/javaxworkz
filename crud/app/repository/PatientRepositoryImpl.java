package com.xwork.crud.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	private String[] patient = new String[TOTAL_NUMBERS];
	private int position;

	@Override
	public void disease(String name) {
		System.out.println("invoking disease() in PatientRepositoryImpl");
		if (position < TOTAL_NUMBERS) {
			this.patient[position] = name;
			System.out.println("numbers:" + name + "name position" + this.position);
			this.position++;
		} else {
			System.err.println("postion is out of bound");
		}
	}

}
