package unique.com.acer;

public class Hotel {
	public Cook cook;
	public void shop() {
		if(this.cook!=null) {
			this.cook.varities();
			System.out.println("invoking varities in Hotel");
		}
		else {
			System.err.println("not invoking varities in Hotel");
			}
	}
		
	
	public void location() {
		if(this.cook!=null) {
			this.cook.taste();
			System.out.println("invoking taste in Hotel");
			}
		else {
			System.err.println("not invoking taste in Hotel");

		}
	}

}
