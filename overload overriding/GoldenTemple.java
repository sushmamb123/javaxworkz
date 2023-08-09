package overriding.com.star;

public class GoldenTemple extends Temple {
	@Override
	public void pooja() {
		System.out.println("invoking pooja in GoldenTemple");
		super.pooja();
	}

	@Override
	public void pooja(String name) {
		super.pooja(name);
	}

	@Override
	public void pooja(String name, String location) {
		super.pooja(name, location);
	}

	@Override
	public void pooja(String name, String location, String deity) {
		super.pooja(name, location, deity);
	}

	@Override
	public void pooja(String name, String location, String deity, int capacity) {
		super.pooja(name, location, deity, capacity);
	}

	@Override
	public void pooja(String name, String location, String deity, int capacity, boolean isPowerful) {
		super.pooja(name, location, deity, capacity, isPowerful);
	}

}
