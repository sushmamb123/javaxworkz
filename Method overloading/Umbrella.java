package chaining.examples;

public class Umbrella {
	public double price;
	public String properties;

	public void rainShade() {
		System.out.println("invoking with rainShade in Umbrella");
		rainShade(100);
		rainShade("Flexible");
	}

	public void rainShade(double price) {
		System.out.println("invoking double in rainShade");
		System.out.println("Umbrella price:" + price);
	}

	public void rainShade(String properties) {
		System.out.println("invoking String in rainShade");
		System.out.println("Umbrella properties:" + properties);

	}

	public void rainShade(double price, String properties) {
		System.out.println("invoking double String in rainShade");
		rainShade(price);
		rainShade(properties);

	}

}


