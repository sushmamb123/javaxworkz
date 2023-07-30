package unique.com.acer;

public class Garage {
	public Mechanic mechanic;
	public void vehicle() {
		if(this.mechanic!=null) {
			this.mechanic.repair();
			System.out.println("invoking repair in Garage");
		}
		else {
			System.err.println("not invoking repair in Garage");
			}
	}
	public void mechanic() {
		if(this.mechanic!=null) {
			this.mechanic.cleaning();
			System.out.println("invoking cleaning in Garage");
			}
		else {
			System.err.println("not invoking cleaning in Garage");

		}
	}


}
