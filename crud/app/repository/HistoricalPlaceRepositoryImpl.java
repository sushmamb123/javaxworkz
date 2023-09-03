package com.xwork.crud.app.repository;

public class HistoricalPlaceRepositoryImpl implements HistoricalPlaceRepository {
	private int[] historical = new int[TOTAL_NAMES];
	private int position;

	@Override
	public void visit(int numbers) {
		System.out.println("invoking visit() in HistoricalPlaceRepositoryImpl");
		if (position < TOTAL_NAMES) {
			this.historical[position] = numbers;
			System.out.println("names:" + numbers + "names position" + this.position);
			this.position++;
		}
		else {
			System.err.println("out of bound");
		}
	}

}
