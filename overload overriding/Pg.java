package overriding.com.star;

public class Pg extends Hostel {
	@Override
	public void owner() {
		System.out.println("invoking in owner in Pg");
		super.owner();
	}

	@Override
	public void owner(int numbers) {
		System.out.println("invoking int owner in Pg");
		super.owner(numbers);
	}

	@Override
	public void owner(int numbers, String name) {
		System.out.println("invoking int,String owner in Pg");
		super.owner(numbers, name);
	}

	@Override
	public void owner(int numbers, String name, String location) {
		System.out.println("invoking int,String,String owner in Pg");
		super.owner(numbers, name, location);
	}

	@Override
	public void owner(int numbers, String name, String location, int pincode) {
		System.out.println("invoking int,String,String,int owner in Pg");
		super.owner(numbers, name, location, pincode);
	}

	@Override
	public void owner(int numbers, String name, String location, int pincode, long mobileNo) {
		System.out.println("invoking int,String,String,int,long owner in Pg");
		super.owner(numbers, name, location, pincode, mobileNo);
	}

}
