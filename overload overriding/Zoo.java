package overriding.com.star;

public class Zoo {
	public void buyTicket() {
		System.out.println("invoking buyTicket method in Zoo");
	}

	public void buyTicket(String name) {
		System.out.println("invoking buyTicket method of String in Zoo");
	}

	public void buyTicket(String name, String location) {
		System.out.println("invoking buyTicket method of String,String in Zoo");
	}

	public void buyTicket(String name, String location, int capacity) {
		System.out.println("invoking buyTicket method of String,String,int in Zoo");
	}

	public void buyTicket(String name, String location, int capacity, double ticketPrice) {
		System.out.println("invoking buyTicket method of String,String,int,double in Zoo");
	}

	public void buyTicket(String name, String location, int capacity, double ticketPrice, boolean hasAquarium) {
		System.out.println("invoking buyTicket method of String,String,int,double,boolean in Zoo");
	}

}
