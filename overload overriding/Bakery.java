package overriding.com.star;

public class Bakery {

	public void item() {
		System.out.println("invoking no-arg in item");

	}

	public void item(double price) {
		System.out.println("invoking double in item");
		System.out.println("price:" + price);

	}

	public void item(double price, String name) {
		System.out.println("invoking double,String in item");
		System.out.println("Name:" + name);
	}

	public void item(double price, String name, String location) {
		System.out.println("invoking double,String,String in item");
		System.out.println("Location:" + location);
	}

	public void item(double price, String name, String location, boolean taste) {
		System.out.println("invoking double,String,String,boolean in item");
		System.out.println("Tate:" + taste);
	}

	public void item(double price, String name, String location, boolean taste, int noOfItems) {
		System.out.println("invoking double,String,String,boolean,int in item");
		System.out.println("No of items:" + noOfItems);
	}

}
