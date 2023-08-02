package unique.com.acer.book;

import Inheritance.Adult;
import Inheritance.Flower;
import Inheritance.Pollination;
import Inheritance.Seedlings;
import Inheritance.Seeds;

public class FlowerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FlowerRunner");
		Flower flower=new Flower();
		Flower flower1=new Seeds();
		Flower flower2=new Seedlings();
		Flower flower3=new Adult();
		Flower flower4=new Pollination();
		flower.flowerInfo();
		System.out.println(flower.name);
		System.out.println("++++++++++++++++++++++++++++++");
		Seeds seeds=new Seeds();
		Seeds seeds1=new Seedlings();
		Seeds seeds2=new Adult();
		Seeds seeds3=new Pollination();
		seeds.seedsInfo();
		System.out.println(seeds.noOfSeeds);
		System.out.println("++++++++++++++++++++++++++++++");
		Seedlings seedlings=new Seedlings();
		Seedlings seedlings1=new Adult();
		Seedlings seedlings2=new Pollination();
		seedlings.seedlingsInfo();
		System.out.println(seedlings.noOfSeedlings);
		System.out.println("++++++++++++++++++++++++++++++");
		Adult adult=new Adult();
		Adult adult1=new Pollination();
		adult.adultInfo();
		System.out.println(adult.age);
		System.out.println("++++++++++++++++++++++++++++++");
		Pollination pollination=new Pollination();
		pollination.pollinationInfo();
		System.out.println(pollination.duration);
		System.out.println("++++++++++++++++++++++++++++++");








	}

}
