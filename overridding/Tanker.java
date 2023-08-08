package overriding.com;

public class Tanker extends Drum {
	@Override
	public void water() {
		System.out.println("invoking water in Tanker");
		super.water();
	}

}
