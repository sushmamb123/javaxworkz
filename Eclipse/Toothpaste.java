package unique.com.acer;

public class Toothpaste {
public String name;
public String brand;
public String company;
public Ingredients[] ingredients;
public Toothpaste(String name,String brand,String company,Ingredients[] ingredients) {
	this.name=name;
	this.brand=brand;
	this.company=company;
	this.ingredients=ingredients;
	
}

public void printInfo() {
	System.out.println();
		System.out.println("name:"+this.name);
		System.out.println("brand:"+this.brand);
		System.out.println("company:"+this.company);
		System.out.println("ingredents:"+this.ingredients);
		for(int index=0;index<this.ingredients.length;index++) {
			Ingredients ref=this.ingredients[index];
			ref.printInfo();
		}

		
}

}
