package overriding.com.star;

public class NavarangTheater extends Theater {
	@Override
	public void display() {
		System.out.println("invoking display in NavarangTheater");
		super.display();
	}

	@Override
	public void display(String name) {
		System.out.println("invoking String display in NavarangTheater");
		super.display(name);
	}

	@Override
	public void display(String name, String area) {
		System.out.println("invoking String,String display in NavarangTheater");
		super.display(name, area);
	}

	@Override
	public void display(String name, String area, String currentMovie) {
		System.out.println("invoking String,String,String display in NavarangTheater");
		super.display(name, area, currentMovie);
	}

	@Override
	public void display(String name, String area, String currentMovie, int ticketPrice) {
		System.out.println("invoking String,String,String,int display in NavarangTheater");
		super.display(name, area, currentMovie, ticketPrice);
	}

	@Override
	public void display(String name, String area, String currentMovie, int ticketPrice, boolean isThereAc) {
		System.out.println("invoking String,String,String,int,boolean display in NavarangTheater");
		super.display(name, area, currentMovie, ticketPrice, isThereAc);
	}

}
