package overriding.com;

public class Banner extends Flex {
	@Override
	public boolean picture() {
		System.out.println("invoking picture in Banner");
		return super.picture();
	}

}
