package unique.com.acer;

public class Floor {
	public String name;
	public int number;

	public Floor(String name,int number) {
		this.name=name;
		this.number=number;

	}

	public void printInfo() {

		System.out.println("Floor name is:"+name);
		System.out.println("Floor number is: "+number);
	}

}


