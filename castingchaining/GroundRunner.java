package com.example.castingchaining.main;

import com.casting.chaining.Ground;
import com.casting.chaining.LandGround;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroundRunner");
		Ground ground=new Ground("Mud","Density",9.0f,"Gas");
		System.out.println(ground.soil);
		System.out.println(ground.properties);
		System.out.println(ground.ph);
		System.out.println(ground.madeOf);
		
		System.out.println("******************************");
		Ground landGround=new LandGround();
		System.out.println(landGround.soil);
		System.out.println(landGround.properties);
		System.out.println(landGround.ph);
		System.out.println(landGround.madeOf);



	}

}
