package overriding.com.star;

public class Cafe extends Pub {
	@Override
	public void enjoy() {
		System.out.println("invoking enjoy in Cafe");
		super.enjoy();
	}

	@Override
	public void enjoy(String name) {
		super.enjoy(name);
	}

	@Override
	public void enjoy(String name, String location) {
		super.enjoy(name, location);
	}

	@Override
	public void enjoy(String name, String location, int capacity) {
		super.enjoy(name, location, capacity);
	}

	@Override
	public void enjoy(String name, String location, int capacity, boolean servesFood) {
		super.enjoy(name, location, capacity, servesFood);
	}

	@Override
	public void enjoy(String name, String location, int capacity, boolean servesFood, String pubType) {
		super.enjoy(name, location, capacity, servesFood, pubType);
	}

}
