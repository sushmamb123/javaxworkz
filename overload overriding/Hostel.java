package overriding.com.star;

public class Hostel {
	public void owner() {
		System.out.println("invoking no-arg in owner");

	}

	public void owner(int numbers) {
		System.out.println("invoking int in owner");

	}

	public void owner(int numbers, String name) {
		System.out.println("invoking int,String in owner");
	}

	public void owner(int numbers, String name, String location) {
		System.out.println("invoking int,String,String in owner");
	}

	public void owner(int numbers, String name, String location, int pincode) {
		System.out.println("invoking int,String,String,boolean in owner");
	}

	public void owner(int numbers, String name, String location, int pincode, long mobileNo) {
		System.out.println("invoking int,String,String,int,long in owner");
	}

}
