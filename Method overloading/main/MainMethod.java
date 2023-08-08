package chaining.examples.main;

import chaining.examples.Elevator;
import chaining.examples.Gadget;
import chaining.examples.Hotel;
import chaining.examples.IronBox;
import chaining.examples.Ladder;
import chaining.examples.Mouse;
import chaining.examples.Plier;
import chaining.examples.Specs;
import chaining.examples.Stapler;
import chaining.examples.Umbrella;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("invoking main in mainMethod");
		Hotel hotel = new Hotel();
		hotel.food();
		hotel.food(573012, "mysore");
		
		System.out.println("^^^^^^^^^^^^^^^^^^");
		IronBox ironBox=new IronBox();
		ironBox.heat();
		ironBox.heat(400,"Black");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		Specs specs=new Specs();
		specs.lens();
		specs.lens(2000,"Convex");
		
		System.out.println("******************************");
		Umbrella umbrella=new Umbrella();
		umbrella.rainShade();
		umbrella.rainShade(150,"Light");
		System.out.println("=================================");
		Stapler stapler=new Stapler();
		stapler.pin();
		stapler.pin(150,"Zinc");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Ladder ladder=new Ladder();
		ladder.climbs();
		ladder.climbs(20,15.2f);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Gadget gadget=new Gadget();
		gadget.device();
		gadget.device("Computer",40000);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Plier plier=new Plier();
		plier.cutting();
		plier.cutting("locking",15.2f);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Mouse mouse=new Mouse();
		mouse.button();
		mouse.button("Wire",200);
		System.out.println("*******************");
		Elevator elevator=new Elevator();
		elevator.escalator();
		elevator.escalator("inactive",14);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		
		
		
	  
	}

	
}
