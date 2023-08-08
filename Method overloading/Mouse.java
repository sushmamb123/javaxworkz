package chaining.examples;

public class Mouse {
	public String types;
	public double price;

	public void button() {
		System.out.println("invoking with button in Mouse");
		button("Wired Mouse");
		button(155);
	}

	public void button(String types) {
		System.out.println("invoking String in button");
		System.out.println("Mouse types:" + types);
	}

	public void button(double price) {
		System.out.println("invoking double in button");
		System.out.println("Mouse price:" + price);

	}

	public void button(String types, double price) {
		System.out.println("invoking String double in button");
		button(types);
		button(price);

	}


}






