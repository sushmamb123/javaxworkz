package chaining.examples;

public class Hotel {
	public int pincode;
	public String location;

	public void food() {
		System.out.println("invoking with food in Hotel");
		food(573120, "Bangalore");
	}

	public void food(int pincode) {
		System.out.println("invoking  int in food");
		System.out.println("Hotel pincode:" + pincode);
	}

	public void food(String location) {
		System.out.println("invoking String in food");
		System.out.println("Hotel location:" + location);

	}

	public void food(int pincode, String location) {
		System.out.println("invoking int String in food");
		food(pincode);
		food(location);

	}

}

	
	


