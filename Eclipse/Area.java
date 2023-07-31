package unique.com.acer;

public class Area {
	public String name;
	public Corporator corporator;

	public Area(String name,Corporator corporator) {

		this.name=name;
		this.corporator=corporator;
	}

	public void printInfo() {

		System.out.println("Area Name is:"+name);
		System.out.println("***********************************");
		corporator.printInfo();
	}

}
 


