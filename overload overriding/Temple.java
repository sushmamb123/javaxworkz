package overriding.com.star;

public class Temple {
	public void pooja() {
		System.out.println("invoking pooja method in Temple");
	}

	public void pooja(String name) {
		System.out.println("invoking pooja method of String in Temple");
	}

	public void pooja(String name, String location) {
		System.out.println("invoking pooja method of String,String in Temple");
	}

	public void pooja(String name, String location, String deity) {
		System.out.println("invoking pooja method of String,String,String in Temple");
	}

	public void pooja(String name, String location, String deity, int capacity) {
		System.out.println("invoking pooja method of String,String,String,int in Temple");
	}

	public void pooja(String name, String location, String deity, int capacity, boolean isPowerful) {
		System.out.println("invoking pooja method of String,String,String,int,boolean in Temple");
	}

}
