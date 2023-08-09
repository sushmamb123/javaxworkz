package overriding.com.star;

public class Hassan extends Street {
	@Override
	public void landMark() {
		System.out.println("invoking landMark in Hassan");
		super.landMark();
	}

	@Override
	public void landMark(String name) {
		super.landMark(name);
	}

	@Override
	public void landMark(String name, String location) {
		super.landMark(name, location);
	}

	@Override
	public void landMark(String name, String location, int length) {
		super.landMark(name, location, length);
	}

	@Override
	public void landMark(String name, String location, int length, int lanes) {
		super.landMark(name, location, length, lanes);
	}

	@Override
	public void landMark(String name, String location, int length, int lanes, boolean hastraficLight) {
		super.landMark(name, location, length, lanes, hastraficLight);
	}

}
