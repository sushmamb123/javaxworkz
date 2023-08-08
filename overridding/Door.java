package overriding.com;

public class Door extends Gate {
	@Override
	public void stell() {
		System.out.println("invoking stell in Gate");
		super.stell();
	}

}
