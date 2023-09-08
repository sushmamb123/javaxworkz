package com.xwork.dto.repository.app;

import com.xwork.dto.app.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository{
	private PrinterDTO[] dto=new PrinterDTO[TOTAL_ITEMS];
	private int position;
	@Override
	public void save(PrinterDTO dto) {
		if(position<TOTAL_ITEMS) {
			this.dto[position]=dto;
			System.out.println("dto"+dto+"position items"+this.position);
			this.position++;
			
		}
		else {
			System.err.println("storage is full,please select another one");
		}
		
	}

}
