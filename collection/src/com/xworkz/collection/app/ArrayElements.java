package com.xworkz.collection.app;
//collection interface,store ref/group of ref
//size is not fixed,methods to perform operation..................
//index is needed for acess or update
//does not have methods
public class ArrayElements {
	public static void main(String[] args) {
		String name = "sushma";
		String brand = "puma";
		String qualification = "BE";
		String fname = "chandhu";
		String roleModel = "Abdulkalam";
		String fatherName = "Bheemegowda";
		String collegeName = "Rajeev";
		String[] names = { name, brand, qualification, fname, roleModel, fatherName, collegeName };
		int total = names.length;

		for (int index = 0; index < names.length; index++) {
			String ref = names[index];
			System.out.println(ref);
		}
		

	}
}
