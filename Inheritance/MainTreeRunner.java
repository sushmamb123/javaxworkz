package unique.com.acer.book;

import Inheritance.Decay;
import Inheritance.Fruit;
import Inheritance.Germination;
import Inheritance.Maturity;
import Inheritance.Reproduce;
import Inheritance.Sapling;
import Inheritance.Seed;
import Inheritance.Seedling;
import Inheritance.Tree;

public class MainTreeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MainTreeRunner");
		
		Tree tree=new Tree();
		Tree tree1=new Seed();
		Tree tree2=new Germination();
		Tree tree3=new Seedling();
		Tree tree4=new Sapling();
		Tree tree5=new Maturity();
		Tree tree6=new Fruit();
		Tree tree7=new Reproduce();
		Tree tree8=new Decay();
		tree.treeInfo();
		System.out.println(tree.type);
		System.out.println("++++++++++++++++++++++++++++");
		Seed seed=new Seed();
		Seed seed1=new Germination();
		Seed seed2=new Seedling();
		Seed seed3=new Sapling();
		Seed seed4=new Maturity();
		Seed seed5=new Fruit();
		Seed seed6=new Reproduce();
		Seed seed7=new Decay();
		seed.seedInfo();
		System.out.println(seed.contains);
		System.out.println("-----------------------------------");
		Germination germination=new Germination();
		Germination germination1=new Seedling();
		Germination germination2=new Sapling();
		Germination germination3=new Maturity();
		Germination germination4=new Fruit();
		Germination germination5=new Reproduce();
		Germination germination6=new Decay();
		germination.germinationInfo();
		System.out.println(germination.duration);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Seedling seedling=new Seedling();
		Seedling seedling1=new Sapling();
		Seedling seedling2=new Maturity();
		Seedling seedling3=new Fruit();
		Seedling seedling4=new Reproduce();
		Seedling seedling5=new Decay();
		seedling.seedlingInfo();
		System.out.println(seedling.howManyDays);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Sapling sapling=new Sapling();
		Sapling sapling1=new Maturity();
		Sapling sapling2=new Fruit();
		Sapling sapling3=new Reproduce();
		Sapling sapling4=new Decay();
		sapling.saplingInfo();
		System.out.println(sapling.inches);
		System.out.println("###########################");
		Maturity maturity=new Maturity();
		Maturity maturity1=new Fruit();
		Maturity maturity2=new Reproduce();
		Maturity maturity3=new Decay();
		maturity.maturityInfo();
		System.out.println(maturity.size);
		System.out.println("====================================");
		Fruit fruit=new Fruit();
		Fruit fruit1=new Reproduce();
		Fruit fruit2=new Decay();
		fruit.fruitInfo();
		System.out.println(fruit.varities);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
		Reproduce reproduce=new Reproduce();
		Reproduce reproduce1=new Decay();
		reproduce.reproduceInfo();
		System.out.println(reproduce.name);
		System.out.println("^^^^^^^^^^^^^^^^^");
		Decay decay=new Decay();
		decay.decayInfo();
		System.out.println(decay.lifeCycle);
		}

}
