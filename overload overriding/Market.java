package overriding.com.star;

public class Market {
	public void sell() {
		System.out.println("invoking sell method in Market");
	}

	public void sell(String name) {
		System.out.println("invoking sell method of String in Market");
	}

	public void sell(String name, String location) {
		System.out.println("invoking sell method of String,String in Market");
	}

	public void sell(String name, String location, String type) {
		System.out.println("invoking sell method of String,String,String in Market");
	}

	public void sell(String name, String location, String type, int capacity) {
		System.out.println("invoking sell method of String,String,String,int in Market");
	}

	public void sell(String name, String location, String type, int capacity, double totalRevenu) {
		System.out.println("invoking sell method of String,String,String,int,double in Market");
	}

}
