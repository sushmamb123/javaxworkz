package unique.com.acer;

public class PowerBank {
	public Battery battery;
	public void company() {
		if(this.battery!=null) {
			this.battery.brand();
			System.out.println("invoking brand in PowerBank");
		}
		else {
			System.err.println("not invoking brand in PowerBank");
			}
	}
		
	
	public void name() {
		if(this.battery!=null) {
			this.battery.features();
			System.out.println("invoking features in PowerBank");
			}
		else {
			System.err.println("not invoking features in PowerBank");

		}
	}
	
		
	}





