package com.xworkz.cracker.boot;

import com.xworkz.cracker.constants.MovieTicketGst;
import com.xworkz.cracker.constants.MovieTicketPrice;
import com.xworkz.cracker.dto.MovieTicketDTO;

public class MovieTickerRunner {
	public static void main(String[] args) {
		
	
	
	MovieTicketDTO dto=new MovieTicketDTO( MovieTicketPrice.GANDHI_CLASS,MovieTicketGst.BALCONY);
	System.out.println(dto);
	System.out.println(dto.getDiscount());
	System.out.println(MovieTicketGst.BALCONY+ " " +MovieTicketGst.BALCONY.getGst());
	}
}
