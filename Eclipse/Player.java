package unique.com.acer;

public class Player {
	public String name;
	public int exp;
	public HomeTown town;
	public Building building;

	public Player(String name,int exp, HomeTown town, Building building) {

		this.name=name;
		this.exp=exp;
		this.town=town;
		this.building=building;

	}

	public void printInfo() {

		System.out.println("Player Name: "+name);
		System.out.println("Player Experience: "+exp);
		System.out.println("***********************************");
		town.printInfo();
		System.out.println("***********************************");
		building.printInfo();

	}

}
