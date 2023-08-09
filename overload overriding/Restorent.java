package overriding.com.star;

public class Restorent extends Hotel {

	@Override
	public void food() {
		System.out.println("invoking food in Restorent");
		super.food();
	}

	@Override
	public void food(String name) {
		System.out.println("invoking string in food");
		super.food(name);
	}

	@Override
	public void food(String name, double price) {
		System.out.println("invoking string,double in food");

		super.food(name, price);
	}

	@Override
	public void food(String name, double price, String location) {
		System.out.println("invoking string,double,String in food");

		super.food(name, price, location);
	}

	@Override
	public void food(String name, double price, String location, boolean taste) {
		System.out.println("invoking string,double,String,boolean in food");

		super.food(name, price, location, taste);
	}

	@Override
	public void food(String name, double price, String location, boolean taste, int pincode) {
		System.out.println("invoking string,double,String,boolean,int in food");

		super.food(name, price, location, taste, pincode);
	}

}
