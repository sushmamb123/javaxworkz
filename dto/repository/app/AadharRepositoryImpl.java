package com.xwork.dto.repository.app;

import com.xwork.dto.app.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository{
	private AadharDTO[] dto=new AadharDTO[TOTAL_ITEMS];
	private int position;
	@Override
	public void save(AadharDTO dto) {
		System.out.println("invoking save() in AadharRepositoryImpl");
		if(position<TOTAL_ITEMS) {
			this.dto[position]=dto;
			System.out.println("dto"+dto+"items position"+this.position);
			this.position++;
		}
		else {
			System.err.println("storage is full,please select another one");
		}
		
	}

}
