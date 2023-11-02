package com.xworkz.collection.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.app.dto.SaloonItemDTO;

public class SaloonItemRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SaloonItemRunner");
		SaloonItemDTO dto1=new SaloonItemDTO(1, "GlamourGlow Salon", 50d, "haircuts", false);
		SaloonItemDTO dto2=new SaloonItemDTO(2, "Elegance Envy", 100d, "styling", true);
		SaloonItemDTO dto3=new SaloonItemDTO(3, "Shear Perfection", 150d, "coloring", false);
		SaloonItemDTO dto4=new SaloonItemDTO(4, "Radiant Beauty Bar", 250d, "manicures", true);
		SaloonItemDTO dto5=new SaloonItemDTO(5, "Beauty Boutique", 350d, "pedicures", false);
		SaloonItemDTO dto6=new SaloonItemDTO(6, "Enchanted Locks", 450d, "facials", true);
		SaloonItemDTO dto7=new SaloonItemDTO(7, "Hair Majesty", 70d, "beauty treatments", false);
		SaloonItemDTO dto8=new SaloonItemDTO(8, "Curl Elegance", 80d, "eye-brow", true);
		SaloonItemDTO dto9=new SaloonItemDTO(9, "Platinum Shears", 90d, "vaccine", false);
		SaloonItemDTO dto10=new SaloonItemDTO(10, "Mane Street Studio", 200d, "hairStyle", true);
		Collection<SaloonItemDTO> saloonItemDTOs=new ArrayList();
		saloonItemDTOs.add(dto1);
		saloonItemDTOs.add(dto2);
		saloonItemDTOs.add(dto3);
		saloonItemDTOs.add(dto4);
		saloonItemDTOs.add(dto5);
		saloonItemDTOs.add(dto6);
		saloonItemDTOs.add(dto7);
		saloonItemDTOs.add(dto8);
		saloonItemDTOs.add(dto9);
		saloonItemDTOs.add(dto10);
		System.out.println("Total saloon : "+saloonItemDTOs.size());

		Iterator<SaloonItemDTO> itr=saloonItemDTOs.iterator();
		int count=0;
		for(SaloonItemDTO saloonItemDTO:saloonItemDTOs) {
			if(saloonItemDTO.getName().contains("S")) {
				System.out.println("SaloonItemDTO:"+saloonItemDTO.getName());
				count++;
			}
			
		}
		System.out.println("count is:"+count);
		Collection<SaloonItemDTO> containCollection=new ArrayList();
		SaloonItemDTO dto11=new SaloonItemDTO(1, "GlamourGlow Salon", 50d, "haircuts", false);
		SaloonItemDTO dto12=new SaloonItemDTO(2, "Elegance Envy", 100d, "styling", true);
		containCollection.add(dto11);
		containCollection.add(dto12);
		
		boolean ref=saloonItemDTOs.containsAll(containCollection);
		System.out.println("contains all:"+ref);
		
		boolean ref1=saloonItemDTOs.remove(dto12);
		System.out.println("Remove:"+ref1);
		System.out.println("Remove size is:"+saloonItemDTOs.size());
		
		Collection<SaloonItemDTO> removeCollection=new ArrayList();
		SaloonItemDTO dto13=new SaloonItemDTO(1, "GlamourGlow Salon", 50d, "haircuts", false);
		SaloonItemDTO dto14=new SaloonItemDTO(2, "Elegance Envy", 100d, "styling", true);
		removeCollection.add(dto13);
		removeCollection.add(dto14);
		
		boolean ref2=saloonItemDTOs.removeAll(removeCollection);
		System.out.println("Remove All:"+ref2);
		System.out.println("Remove all saloon size is:"+saloonItemDTOs.size());
		

		
}

}
