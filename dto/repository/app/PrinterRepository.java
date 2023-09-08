package com.xwork.dto.repository.app;

import com.xwork.dto.app.PrinterDTO;

public interface PrinterRepository {
	int TOTAL_ITEMS=10;
	void save(PrinterDTO dto);

}
