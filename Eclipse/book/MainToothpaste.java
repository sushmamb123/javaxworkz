package unique.com.acer.book;

import unique.com.acer.Company;
import unique.com.acer.Ingredients;
import unique.com.acer.Toothpaste;

public class MainToothpaste {

	public static void main(String[] args) {
		System.out.println("invoking main in MainRunnerToothpaste");
		System.out.println("invoking main in Toothpaste in MainRunnerToothpaste");
		String name="Dabar Red";
		String brand="Ayurvedic";
		String company="Colgate";
		Company company1=new Company("Dabar Red","sachin","India");
		Ingredients ingredients1=new Ingredients("Hydrogen peroxide",20,40.00f);
		Ingredients ingredients2=new Ingredients("Sodium",30,50.00f);
		Ingredients ingredients3=new Ingredients("Triclosan",10,20.00f);
		Ingredients ingredients4=new Ingredients("Propylene",50,70.00f);
		Ingredients ingredients5=new Ingredients("Dioctyl",40,80.00f);
		Ingredients[] ingredients= {ingredients1,ingredients2,ingredients3,ingredients4,ingredients5};
		Toothpaste toothpaste=new Toothpaste(name,brand,company,ingredients);
		toothpaste.printInfo();
		company1.printInfo();

		


	}

}
