package com.example.castingchaining.main;

import com.casting.chaining.Rope;
import com.casting.chaining.ThreadRope;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RopeRunner");
		Rope rope=new Rope("Hunting","Aramid",13.2f,500.0d);
		System.out.println(rope.use);
		System.out.println(rope.materials);
		System.out.println(rope.diameter);
		System.out.println(rope.price);
		
		System.out.println("******************************");
		Rope threadRope=new ThreadRope();
		System.out.println(threadRope.use);
		System.out.println(threadRope.materials);
		System.out.println(threadRope.diameter);
		System.out.println(threadRope.price);



	}

}
