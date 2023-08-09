package overriding.com.star;

public class RailwayStation extends PoliceStation {
	@Override
	public void arrest() {
		System.out.println("invoking arrest in RailwayStation");
		super.arrest();
	}

	@Override
	public void arrest(String name) {
		super.arrest(name);
	}

	@Override
	public void arrest(String name, String location) {
		super.arrest(name, location);
	}

	@Override
	public void arrest(String name, String location, int officersCount) {
		super.arrest(name, location, officersCount);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail) {
		super.arrest(name, location, officersCount, hasJail);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail, String emergencyNumber) {
		super.arrest(name, location, officersCount, hasJail, emergencyNumber);
	}

}
