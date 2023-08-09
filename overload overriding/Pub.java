package overriding.com.star;

public class Pub {
	public void enjoy() {
		System.out.println("invoking enjoy method in Pub");
	}

	public void enjoy(String name) {
		System.out.println("invoking enjoy method of String in Pub");
	}

	public void enjoy(String name, String location) {
		System.out.println("invoking enjoy method of String,String in Pub");
	}

	public void enjoy(String name, String location, int capacity) {
		System.out.println("invoking enjoy method of String,String,int in Pub");
	}

	public void enjoy(String name, String location, int capacity, boolean servesFood) {
		System.out.println("invoking enjoy method of String,String,int,boolean in Pub");
	}

	public void enjoy(String name, String location, int capacity, boolean servesFood, String pubType) {
		System.out.println("invoking enjoy method of String,String,int,boolean,String in Pub");
	}

}
