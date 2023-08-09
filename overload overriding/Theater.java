package overriding.com.star;

public class Theater {
	public void display() {
		System.out.println("invoking dispaly method in Theater");
	}

	public void display(String name) {
		System.out.println("invoking dispaly method of String  in Theater");
	}

	public void display(String name, String area) {
		System.out.println("invoking dispaly method of String,String in Theater");
	}

	public void display(String name, String area, String currentMovie) {
		System.out.println("invoking dispaly method of String,String,String in Theater");
	}

	public void display(String name, String area, String currentMovie, int ticketPrice) {
		System.out.println("invoking dispaly method of String,String,String,int in Theater");
	}

	public void display(String name, String area, String currentMovie, int ticketPrice, boolean isThereAc) {
		System.out.println("invoking dispaly method of String,String,String,int,boolean in Theater");
	}

}
