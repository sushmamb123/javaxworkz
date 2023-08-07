package chaining.examples;

public class IronBox {
	public double price;
	public String color;

	public void heat() {
		System.out.println("invoking with heat in IronBox");
		heat(1000);
		heat("White");
	}

	public void heat(double price) {
		System.out.println("invoking double in heat");
		System.out.println("IronBox price:" + price);
	}

	public void heat(String color) {
		System.out.println("invoking String in heat");
		System.out.println("IronBox color:" + color);

	}

	public void heat(double price, String color) {
		System.out.println("invoking double String in heat");
		heat(price);
		heat(color);

	}

}
