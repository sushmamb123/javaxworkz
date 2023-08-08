package overriding.com;

public class Speaker extends Mic {
	@Override
	public boolean sound() {
		System.out.println("invoking sound in Speaker");
		return super.sound();
	}

}
