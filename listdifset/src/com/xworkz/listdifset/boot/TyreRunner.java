package com.xworkz.listdifset.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.listdifset.dto.TyreDTO;

public class TyreRunner {

	public static void main(String[] args) {
		System.out.println("invoking in tyre Runner");
		TyreDTO dto1=new TyreDTO("pirelli", "JK", 75, "185mm");
		TyreDTO dto2=new TyreDTO("Biidgestone", "goodyear", 80, "195mm");
		TyreDTO dto3=new TyreDTO("continental", "falken tyres", 90, "165mm");
		TyreDTO dto4=new TyreDTO("Dunlop", "metzeler", 50, "145mm");
		TyreDTO dto5=new TyreDTO("Hankoook tire", "MRF", 40, "135mm");
		TyreDTO dto6=new TyreDTO("pirelli", "JK", 75, "185mm");
		TyreDTO dto7=new TyreDTO("pirelli", "JK", 75, "185mm");
		Collection<TyreDTO> tyreDTOs=new HashSet<TyreDTO>();
		tyreDTOs.add(dto1);
		tyreDTOs.add(dto2);
		tyreDTOs.add(dto3);
		tyreDTOs.add(dto4);
		tyreDTOs.add(dto5);
		tyreDTOs.add(dto6);
		tyreDTOs.add(dto7);
		
		System.out.println("Total tyres:"+tyreDTOs.size());



	}

}
