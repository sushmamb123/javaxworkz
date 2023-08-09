package overriding.com.star;

public class Shop extends Hospital {
	@Override
	public void injection() {
		super.injection();
	}

	@Override
	public void injection(double price) {
		super.injection(price);
	}

	@Override
	public void injection(double price, String name) {
		super.injection(price, name);
	}

	@Override
	public void injection(double price, String name, String location) {
		super.injection(price, name, location);
	}

	@Override
	public void injection(double price, String name, String location, boolean taste) {
		super.injection(price, name, location, taste);
	}

	@Override
	public void injection(double price, String name, String location, boolean taste, int noOfItems) {
		super.injection(price, name, location, taste, noOfItems);
	}

}
