package com.xworkz.sorting.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sorting.dto.TheaterDTO;

public class Theater {

	public static void main(String[] args) {
		System.out.println("invoking main in theater...");
		TheaterDTO dto1=new TheaterDTO(" Majestic Theater", "Bangalore", 10, true);
		TheaterDTO dto2=new TheaterDTO(" Royal Opera House", "Hassan", 6, false);
		TheaterDTO dto3=new TheaterDTO(" Grand Playhouse", "Mysore", 7, true);
		TheaterDTO dto4=new TheaterDTO(" Lyric Theatre", "Chikkmanagaluru", 5, false);
		TheaterDTO dto5=new TheaterDTO(" Orpheum Theatre", "Mangalore", 9, true);
		Collection<TheaterDTO> theater=new ArrayList<TheaterDTO>();
		theater.add(dto1);
		theater.add(dto2);
		theater.add(dto3);
		theater.add(dto4);
		theater.add(dto5);
		
		System.out.println("total theaters:"+theater.size());
		for (TheaterDTO theaterDTO : theater) {
			System.out.println(theaterDTO);
			
		}
		System.out.println("*******************************************************************");
		theater.stream().sorted().forEach(t->System.out.println(t));

		

	}

}
