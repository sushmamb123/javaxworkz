package com.xwork.curd.application.app.Repository;

public class LocationRepositoryImpl implements LocationRepository {
	private String[] location = new String[TOTAL_LOCATION];
	private int position;

	@Override
	public void save(String name) {
		System.out.println("invoking save() in LocationRepositoryImpl");
		if (position < TOTAL_LOCATION) {
			this.location[position] = name;
			System.out.println("location:" + name + "location position" + this.position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(String name) {
		for (int index = 0; index <= this.position; index++) {
			String temp = this.location[index];
			if (temp != null && temp.equals(name)) {
				System.out.println("location already exist please select another one" + name);
				return true;
			}

		}
		return false;
	}

}
