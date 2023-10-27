package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//always store the ref
//for loop
//for each
//index
//for each,for each Method*,iterator,stream
//hasNext(check the next element there are not, return type boolean),next(print the values),remove(iterator)
//addAll,remove,contains,isEmpty,clear,removeAll,containsAll
public class RiverNamesCollection {
	public static void main(String[] args) {
		Collection<String> river = new ArrayList();
		river.add("Kaveri");
		river.add("Hemavathi");
		river.add("Tunga");
		river.add("Sharavathi");
		river.add("Ganga");
		System.out.println("Total rivers:" + river.size());
		Iterator<String> iter = river.iterator();
		while (iter.hasNext()) {
			String value = iter.next();
			System.out.println("Rivers names:" + value);
		}
		System.out.println("----------Remove---------------");
		boolean iter1=river.remove(river);
		Iterator<String> iter11 = river.iterator();
		while (iter11.hasNext()) {
			String names = iter11.next();
			System.out.println("Rivers remove:" + names);

		}
		System.out.println("-----------Add all ---------");
		river.addAll(river);
		Iterator<String> iter2 = river.iterator();
		while (iter2.hasNext()) {
			String add = iter2.next();
			System.out.println("Add river names:" + add);
		}
		System.out.println("---------------contain---------------");
		boolean ref=river.contains("kaveri");

		Iterator<String> iter3 = river.iterator();
		
			System.out.println(ref);
		System.out.println("--------------contains all--------");
		Iterator<String> iter4 = river.iterator();
		boolean exist=river.containsAll(river);

		while (iter4.hasNext()) {
			String all = iter4.next();
			System.out.println("contains all:" + all);
		}
		System.out.println("-----------Remove all---------");
		river.removeAll(river);
		Iterator<String> iter5 = river.iterator();
		while (iter5.hasNext()) {
			String remove = iter5.next();
			System.out.println("remove all:" + remove);
		}
		System.out.println("----clear------");
		river.clear();
		Iterator<String> iter51 = river.iterator();
		System.out.println("-----is empty");
		river.isEmpty();
		Iterator<String> iter6 = river.iterator();
		

	}
}
