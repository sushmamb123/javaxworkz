package overriding.com.star;

public class Hospital {
	public void injection() {
		System.out.println("invoking no-arg in item");

	}

	public void injection(double price) {
		System.out.println("invoking double in item");

	}

	public void injection(double price, String name) {
		System.out.println("invoking double,String in item");
	}

	public void injection(double price, String name, String location) {
		System.out.println("invoking double,String,String in item");
	}

	public void injection(double price, String name, String location, boolean taste) {
		System.out.println("invoking double,String,String,boolean in item");
	}

	public void injection(double price, String name, String location, boolean taste, int noOfItems) {
		System.out.println("invoking double,String,String,boolean,int in item");
	}

}
