package overriding.com.star;

public class Library {
	public void displyaInfo() {
		System.out.println("invoking displayInfo method in Library");
	}

	public void displyaInfo(String name) {
		System.out.println("invoking displayInfo method of String in Library");
	}

	public void displyaInfo(String name, int capacity) {
		System.out.println("invoking displayInfo method of String,int in Library");
	}

	public void displyaInfo(String name, int capacity, String location) {
		System.out.println("invoking displayInfo method of String,int,Strign in Library");
	}

	public void displyaInfo(String name, int capacity, String location, String librarian) {
		System.out.println("invoking displayInfo method of String,int,Strign,String in Library");
	}

	public void displyaInfo(String name, int capacity, String location, String librarian, int openHours) {
		System.out.println("invoking displayInfo method of String,int,Strign,String,int in Library");
	}

}


