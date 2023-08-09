package overriding.com.star;

public class City {
	public void welcome() {
		System.out.println("invoking welcome method in City");
	}

	public void welcome(String name) {
		System.out.println("invoking welcome method of String in City");
	}

	public void welcome(String name, String country) {
		System.out.println("invoking welcome method of String,String in City");
	}

	public void welcome(String name, String country, int population) {
		System.out.println("invoking welcome method of String,String,int in City");
	}

	public void welcome(String name, String country, int population, double area) {
		System.out.println("invoking welcome method of String,String,int,double in City");
	}

	public void welcome(String name, String country, int population, double area, String mayor) {
		System.out.println("invoking welcome method of String,String,int,double,String in City");
	}

}
