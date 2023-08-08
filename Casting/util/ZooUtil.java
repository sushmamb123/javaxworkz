package com.example.casting.util;

import com.example.casting.ex4.NationalZoo;
import com.example.casting.ex4.StateZoo;
import com.example.casting.ex4.Zoo;

public class ZooUtil extends Zoo{
	public void run(Zoo zoo) {
		Zoo zoo2 = new Zoo();
		zoo2.animals();

		if (zoo instanceof StateZoo) {
			Zoo zoo3 = new StateZoo();
			zoo3.animals();

			StateZoo stateZoo = (StateZoo) zoo3;
			stateZoo.trees();
		}

		if (zoo instanceof NationalZoo) {
			Zoo zoo4 = new NationalZoo();
			zoo4.animals();

			NationalZoo nationalZoo = new NationalZoo();
			nationalZoo.nature();
		}

	}

}
