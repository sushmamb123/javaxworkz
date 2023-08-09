package overriding.com.star;

public class Hotel {
	public void food() {
		System.out.println("invoking no-arg in item");

	}

	public void food(String name) {
		System.out.println("invoking String in food");

	}

	public void food(String name, double price) {
		System.out.println("invoking String,double in food");
	}

	public void food(String name, double price, String location) {
		System.out.println("invoking String,double,String in food");
	}

	public void food(String name, double price, String location, boolean taste) {
		System.out.println("invoking ,String,double,String,boolean in food");
	}

	public void food(String name, double price, String location, boolean taste, int pincode) {
		System.out.println("invoking String,double,String,boolean,int in food");
	}

}
