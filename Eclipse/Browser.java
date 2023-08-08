package unique.com.acer;

public class Browser {
	public Internet internet;
	public void network() {
		if(this.internet!=null) {
			this.internet.mobile();
			System.out.println("invoking mobile in Browser");
		}
		else {
			System.err.println("not invoking mobile in Browser");
			}
	}
	public void issues() {
		if(this.internet!=null) {
			this.internet.data();
			System.out.println("invoking usage in Browser");
			}
		else {
			System.err.println("not invoking usage in Browser");

		}
	}
		
	}
	


