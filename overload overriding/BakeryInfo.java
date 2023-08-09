package overriding.com.star;

public class BakeryInfo extends Bakery {
	@Override
	public void item() {
		System.out.println("invoking item in BakeryInfo");
		super.item();
	}

	@Override
	public void item(double price) {
		System.out.println("invoking double item in BakeryInfo");
		super.item(price);
	}

	@Override
	public void item(double price, String name) {
		System.out.println("invoking double item in BakeryInfo");
		super.item(price, name);
	}

	@Override
	public void item(double price, String name, String location) {
		System.out.println("invoking double,String,String item in BakeryInfo");
		super.item(price, name, location);
	}

	@Override
	public void item(double price, String name, String location, boolean taste) {
		System.out.println("invoking double item in BakeryInfo");
		super.item(price, name, location, taste);
	}

	@Override
	public void item(double price, String name, String location, boolean taste, int noOfItems) {
		System.out.println("invoking double item in BakeryInfo");
		super.item(price, name, location, taste, noOfItems);
	}

}
