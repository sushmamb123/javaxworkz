package com.xwork.curd.application.app.Repository;

public class MobileNoRepositoryImpl implements MobileNoRepository{
	private long[] numbres = new long[TOTAL_ITEMS];
	private int position;

	@Override
	public void storeContact(long number) {
		System.out.println("Invoking storeContact in MobileRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.numbres[position] = number;
			System.out.println("Mobile number " + number + " is at position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full connot store more data");
		}

	}

	@Override
	public boolean isExist(long number) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.numbres[index];
			if (temp != 0 && temp == number) {
				System.out.println("Number already exist..");
				return true;
			}
		}
		return false;
	}


}
