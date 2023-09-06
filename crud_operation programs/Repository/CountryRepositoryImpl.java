package com.xwork.curd.application.app.Repository;

public class CountryRepositoryImpl implements CountryRepository{
	private String[] cnames = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void store(String cname) {
		System.out.println("Invoking store in CountryRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.cnames[position] = cname;
			System.out.println("Country name " + cname + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Index is full connot store more data");
		}

	}

	@Override
	public boolean isExist(String cname) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.cnames[index];
			if (temp != null && temp.equals(cname)) {
				System.out.println("Country already exist..");
				return true;
			}
		}
		return false;
	}

}
