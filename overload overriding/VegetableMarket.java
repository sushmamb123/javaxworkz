package overriding.com.star;

public class VegetableMarket extends Market {
	@Override
	public void sell() {
		System.out.println("invoking sell in VegetableMarket");
		super.sell();
	}

	@Override
	public void sell(String name) {
		super.sell(name);
	}

	@Override
	public void sell(String name, String location) {
		super.sell(name, location);
	}

	@Override
	public void sell(String name, String location, String type) {
		super.sell(name, location, type);
	}

	@Override
	public void sell(String name, String location, String type, int capacity) {
		super.sell(name, location, type, capacity);
	}

	@Override
	public void sell(String name, String location, String type, int capacity, double totalRevenu) {
		super.sell(name, location, type, capacity, totalRevenu);
	}

}
