package com.xworkz.collection.app.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FestivalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Festival Runner...");
		Collection<String> festival = new LinkedList<String>();
		festival.add("Holi");
		festival.add("Deepavali");
		festival.add("Navaratri");
		festival.add("Christmas");
		festival.add("Makar Sankranti");
		festival.add("Ugadi");
		festival.add("Ram Navami");
		festival.add("Raksha Bandhan");
		festival.add("Ganesha Chaturthi");
		festival.add("Christmas");
		festival.add("Valmiki Jayanti");
		festival.add("Durga pooja");
		festival.add("Id E Milad");
		festival.add("Onam");
		festival.add("Buddha Purnima");
		festival.add("New Year");
		System.out.println("total number of festival:" + festival.size());
		System.out.println("=======================");
		System.out.println("Festivals with more than 6 character:");
		festival.stream().filter(fest->fest.length()>6).forEach(fest-> System.out.println(fest));
		System.out.println("+++++++++++++++++++++++++++++++++");
		festival.stream().filter(fest->fest.length()<6).forEach(fest-> System.out.println(fest));
		System.out.println("+++++++++++++++++++++++++++++++++");
		festival.stream().filter(fest->fest.contains("O")|| fest.contains("o")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest->!fest.contains("g")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("============================================");
		festival.stream().filter(fest->fest.endsWith("S")|| fest.endsWith("s")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest->fest.contains("Z")|| fest.contains("R")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		System.out.println("-----------------------------------------");
		festival.stream().filter(fest-> fest.contains("Ram")).collect(Collectors.toList()).forEach(fest->System.out.println(fest));
		
	}
}
