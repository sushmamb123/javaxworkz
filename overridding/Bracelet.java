package overriding.com;

public class Bracelet extends Bangle {
	@Override
	public boolean Sound() {
		System.out.println("invoking Sound in Bracelet");
		return super.Sound();
	}

}
