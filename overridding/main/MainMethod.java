package overriding.com.main;

import overriding.com.Amoeba;
import overriding.com.Bangle;
import overriding.com.Banner;
import overriding.com.Bracelet;
import overriding.com.Coal;
import overriding.com.Dinosaur;
import overriding.com.Door;
import overriding.com.Drum;
import overriding.com.Flex;
import overriding.com.Gate;
import overriding.com.GoodCoal;
import overriding.com.Mic;
import overriding.com.Movie;
import overriding.com.Organism;
import overriding.com.Speaker;
import overriding.com.Tanker;
import overriding.com.Theater;
import overriding.com.Theropods;
import overriding.com.Ticket;
import overriding.com.TrainTicket;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("ivoking main in MainMethod");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Coal coal = new GoodCoal();
		coal.burn();
		System.out.println("*********************************");
		Amoeba amoeba = new Organism();
		amoeba.cell();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Bangle bangle = new Bracelet();
		bangle.Sound();
		System.out.println("************************************");
		Gate gate = new Door();
		gate.stell();
		System.out.println("############################");
		Dinosaur dinosaur = new Theropods();
		dinosaur.animal();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		Flex flex = new Banner();
		flex.picture();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Mic mic = new Speaker();
		mic.sound();
		System.out.println("*******************************");
		Drum drum = new Tanker();
		drum.water();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Theater theater = new Movie();
		theater.person();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Ticket ticket = new TrainTicket();
		ticket.ticketInfo();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");

	}

}
