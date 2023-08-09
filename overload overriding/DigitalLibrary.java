package overriding.com.star;

public class DigitalLibrary extends Library {
	@Override
	public void displyaInfo() {
		System.out.println("invoking displayInfo in DigitalLibrary");
		super.displyaInfo();
	}

	@Override
	public void displyaInfo(String name) {
		super.displyaInfo(name);
	}

	@Override
	public void displyaInfo(String name, int capacity) {
		super.displyaInfo(name, capacity);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location) {
		super.displyaInfo(name, capacity, location);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian) {
		super.displyaInfo(name, capacity, location, librarian);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian, int openHours) {
		super.displyaInfo(name, capacity, location, librarian, openHours);
	}

}
