package com.xworkz.sorting.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sorting.dto.TowerDTO;

public class Tower {

	public static void main(String[] args) {
		System.out.println("invoking main in Tower");
		TowerDTO dto1=new TowerDTO("Burj Khalifa", 324.0f, 10, 2.8f);
		TowerDTO dto2=new TowerDTO("Eiffel Tower ", 424.0f, 20, 3.8f);
		TowerDTO dto3=new TowerDTO("Leaning Tower of Pisa ", 524.0f, 5, 4.8f);
		TowerDTO dto4=new TowerDTO("Petronas Towers ", 624.0f, 8, 10.8f);
		TowerDTO dto5=new TowerDTO("Shanghai Tower", 724.0f, 7, 11.8f);
		
		Collection<TowerDTO> towerDTOs=new ArrayList<TowerDTO>();
		towerDTOs.add(dto1);
		towerDTOs.add(dto2);
		towerDTOs.add(dto3);
		towerDTOs.add(dto4);
		towerDTOs.add(dto5);
		
		System.out.println("Total tower:"+towerDTOs.size());
		for (TowerDTO towerDTO : towerDTOs) {
			System.out.println(towerDTO);
			
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		towerDTOs.stream().sorted().forEach(tow->System.out.println(tow));


		
	}

}
