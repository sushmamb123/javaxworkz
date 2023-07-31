package unique.com.acer;

public class HomeTown {
	public String name;
	public double pinCode;
	public Area[] areas;


	public HomeTown(String name, double pinCode, Area[] areas) {

		this.name=name;
		this.pinCode=pinCode;
		this.areas=areas;

	}
	public void printInfo() {
		System.out.println("Hometown Name is: "+name);
		System.out.println("Pincode is: "+pinCode);

		for(int size=0;size<areas.length;size++) {

			Area ref=this.areas[size];
			ref.printInfo();

		}

	}

}
 


