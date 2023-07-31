package unique.com.acer;

public class Ingredients {
	public String name;
	public int quantity;
	public float cost;
	public Ingredients(String name,int quantity,float cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo() {
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		}

}
