package com.example.casting.util;

import com.example.casting.ex3.CaramelChocolate;
import com.example.casting.ex3.Chocolate;
import com.example.casting.ex3.DarkChocolate;

public class ChocolateUtil extends Chocolate{
	public void run(Chocolate chocolate) {

		Chocolate chocolate2 = new Chocolate();
		chocolate2.taste();

		if (chocolate instanceof DarkChocolate) {
			Chocolate dark = new DarkChocolate();
			dark.taste();

			DarkChocolate dark2 = (DarkChocolate) dark;
			dark2.cost();
		}

		if (chocolate instanceof CaramelChocolate) {
			Chocolate caramel = new CaramelChocolate();
			caramel.taste();

			CaramelChocolate caramel2 = (CaramelChocolate) caramel;
			caramel2.milk();
		}
	}
}
	


