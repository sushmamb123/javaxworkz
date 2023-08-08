package overriding.com;

public class Movie extends Theater {
	@Override
	public void person() {
		System.out.println("invokin person in Movie");
		super.person();
	}

}
