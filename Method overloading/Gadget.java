package chaining.examples;

public class Gadget {
	public String types;
	public double price;

	public void device() {
		System.out.println("invoking with devices in Gadget");
		device("Smart Phone");
		device(10000);
	}

	public void device(String types) {
		System.out.println("invoking String in device");
		System.out.println("Gadget types:" + types);
	}

	public void device(double price) {
		System.out.println("invoking double in device");
		System.out.println("Gadget price:" + price);

	}

	public void device(String types, double price) {
		System.out.println("invoking String double in device");
		device(types);
		device(price);

	}


}



