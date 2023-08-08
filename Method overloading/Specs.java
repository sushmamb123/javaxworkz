package chaining.examples;

public class Specs {
	public double price;
	public String type;
	
	
	public void lens() {
		System.out.println("invoking lens in Specs");
		lens(1000);
		lens("Concave");
		
	}
	public void lens(double price) {
		System.out.println("invoking double in lens");
		System.out.println("Specs price:"+price);
	}
	public void lens(String type) {
		System.out.println("invoking string in lens");
		System.out.println("Specs type:"+type);
	}
	public void lens(double price,String type) {
		System.out.println("invoking double String in lens");
		lens(price);
		lens(type);
	}

}
