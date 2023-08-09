package overriding.com.star;

public class Mall {
	public void invite() {
		System.out.println("invoking invite method in Mall");
	}

	public void invite(String name) {
		System.out.println("invoking invite method of String in Mall");
	}

	public void invite(String name, String location) {
		System.out.println("invoking invite method of String,String in Mall");
	}

	public void invite(String name, String location, double dailyProfit) {
		System.out.println("invoking invite method of String,String,double in Mall");
	}

	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay) {
		System.out.println("invoking invite method of String,String,double,int in Mall");
	}

	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay, boolean isThereGST) {
		System.out.println("invoking invite method of String,String,double,int,boolean in Mall");
	}

}
