package chaining.examples;

public class Stapler {
	public double price;
	public String materials;

	public void pin() {
		System.out.println("invoking with pin in IronBox");
		pin(200);
		pin("Plastic");
	}

	public void pin(double price) {
		System.out.println("invoking double in pin");
		System.out.println("Stapler price:" + price);
	}

	public void pin(String materials) {
		System.out.println("invoking String in pin");
		System.out.println("Stapler materials:" + materials);

	}

	public void pin(double price, String materials) {
		System.out.println("invoking double String in pin");
		pin(price);
		pin(materials);

	}


}
