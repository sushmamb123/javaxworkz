package unique.com.acer.book;

import Inheritance.Bird;
import Inheritance.ButterFly;
import Inheritance.Eggs;
import Inheritance.Larva;
import Inheritance.NameOfBird;
import Inheritance.Pupa;

public class BirdRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BirdRunner");
		Bird bird=new Bird();
		Bird bird1=new ButterFly();
		Bird bird2=new Eggs();
		Bird bird3=new Larva();
		Bird bird4=new Pupa();
		Bird bird5=new NameOfBird();
		bird.birdInfo();
		System.out.println(bird.name);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		ButterFly butterFly=new ButterFly();
		ButterFly butterFly1=new Eggs();
		ButterFly butterFly2=new Larva();
		ButterFly butterFly3=new Pupa();
		ButterFly butterFly4=new NameOfBird();
		butterFly.butterFlyInfo();
		System.out.println(butterFly.lifeSpan);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		Eggs eggs=new Eggs();
		Eggs eggs1=new Larva();
		Eggs eggs2=new Pupa();
		Eggs eggs3=new NameOfBird();
		eggs.eggsInfo();
		System.out.println(eggs.duration);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		Larva larva=new Larva();
		Larva larva1=new Pupa();
		Larva larva2=new NameOfBird();
		larva.larvaInfo();
		System.out.println(larva.place);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		Pupa pupa=new Pupa();
		Pupa pupa1=new NameOfBird();
		pupa.pupaInfo();
		System.out.println(pupa.size);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		NameOfBird nameOfBird=new NameOfBird();
		nameOfBird.nameOfBirdInfo();
		System.out.println(nameOfBird.habbit);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");








	}

}
