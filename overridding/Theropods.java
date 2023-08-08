package overriding.com;

public class Theropods extends Dinosaur {
	@Override
	public void animal() {
		System.out.println("invoking animal in Theropods");
		super.animal();
	}

}
