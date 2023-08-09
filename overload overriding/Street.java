package overriding.com.star;

public class Street {
	public void landMark() {
		System.out.println("invoking landMark method in Street");
	}

	public void landMark(String name) {
		System.out.println("invoking landMark method of String in Street");
	}

	public void landMark(String name, String location) {
		System.out.println("invoking landMark method of String,String in Street");
	}

	public void landMark(String name, String location, int length) {
		System.out.println("invoking landMark method of String,String,int in Street");
	}

	public void landMark(String name, String location, int length, int lanes) {
		System.out.println("invoking landMark method of String,String,int,int in Street");
	}

	public void landMark(String name, String location, int length, int lanes, boolean hastraficLight) {
		System.out.println("invoking landMark method of String,String,int,int,boolean in Street");
	}

}


