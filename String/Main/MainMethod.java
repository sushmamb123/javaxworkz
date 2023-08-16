package com.xwork.String.Main;

import com.xwork.String.Cave;
import com.xwork.String.Flag;
import com.xwork.String.Karchief;
import com.xwork.String.Logo;
import com.xwork.String.Pendant;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("invoking main in MainMethod");
		System.out.println("invoking main in Logo");
		Logo logo = new Logo(null, null, false, null, null);
		System.out.println(logo);
		Logo logo1 = new Logo("Brand Mark", "Brand", false, "Relevance", "Emblems");
		System.out.println(logo1);
		Logo logo2 = new Logo("Graphic", "Colours", true, "Space", "Mascot");
		System.out.println(logo2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("invoking main in Karchief");
		Karchief karchief = new Karchief(null, null, 0, null, null, null, null);
		System.out.println(karchief);
		Karchief karchief1 = new Karchief("Cotton", "Babushka", 30, "pink", "King Richard", "French", "Light weight");
		System.out.println(karchief1);
		Karchief karchief2 = new Karchief("Silver", "Bandanna", 40, "White", "King Richard", "French", "Fine");
		System.out.println(karchief2);
		System.out.println("******************************************");
		System.out.println("invoking main in Flag");
		Flag flag = new Flag("Orange", 100, null);
		System.out.println(flag);
		Flag flag1 = new Flag("White", 50, "Decoration");
		System.out.println(flag1);
		Flag flag2 = new Flag("Green", 500, "Festivals");
		System.out.println(flag2);
		System.out.println("**********************************************");
		System.out.println("invoking main in Cave");
		Cave cave = new Cave("Dark", "Solution", "Flowstones", "Sulfide-Oxide", "LimeStone", "Trogloxenes", null, 0, 0,
				0);
		System.out.println(cave);
		Cave cave1 = new Cave("High Humidity", "Lava", "columns", "Phosphates", "Dolomite", "Troglophiles", "Ajanta",
				1.2f, 14.2f, 10.2f);
		System.out.println(cave1);
		Cave cave2 = new Cave("Temperature const", "ICE", "Soda Straws", "Sulfates", "Marble", "Troglobites", "Elora",
				1.5f, 12.2f, 11.2f);
		System.out.println(cave2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("invoking main in Pendant");
		Pendant pendant = new Pendant(null, null, null, null, null, null, null, null, null, null, null, null);
		System.out.println(pendant);
		Pendant pendant1 = new Pendant("Cork", "Size", "Graphical", "Bail", "Gold", "Gems", "Gold Box", "Symbolic",
				"Prong", "Blue", "Offences", "Size");
		System.out.println(pendant1);
		Pendant pendant2 = new Pendant("Yellow Steel", "Shape", "Geometry", "Bail", "Silver", "metals", "Curb Link",
				"Magical", "prong", "White", "bail", "pieces");
		System.out.println(pendant2);

	}

}
