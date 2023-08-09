package overriding.com.star;

public class MysoreZoo extends Zoo {
	@Override
	public void buyTicket() {
		System.out.println("invoking buyTicket in MysoreZoo");
		super.buyTicket();
	}

	@Override
	public void buyTicket(String name) {
		super.buyTicket(name);
	}

	@Override
	public void buyTicket(String name, String location) {
		super.buyTicket(name, location);
	}

	@Override
	public void buyTicket(String name, String location, int capacity) {
		super.buyTicket(name, location, capacity);
	}

	@Override
	public void buyTicket(String name, String location, int capacity, double ticketPrice) {
		super.buyTicket(name, location, capacity, ticketPrice);
	}

	@Override
	public void buyTicket(String name, String location, int capacity, double ticketPrice, boolean hasAquarium) {
		super.buyTicket(name, location, capacity, ticketPrice, hasAquarium);
	}

}
