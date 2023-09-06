package com.xwork.curd.application.app.Repository;

public class PincodeRepositoryImpl implements PincodeRepository {
	private int[] pincode = new int[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(int pincode) {
		System.out.println("invoking main in save() in PincodeRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.pincode[position] = pincode;
			System.out.println("items:" + pincode + "items position" + this.position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(int pincode) {
		for (int start = 0; start <= this.position; start++) {
			int temp = this.pincode[start];
			if (temp == pincode) {
				System.err.println("pincode is already exist,please select another one");
				return true;
			}

		}

		return false;
	}

}
