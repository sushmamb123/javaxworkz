package overriding.com.star;

public class HassanCity extends City {
	@Override
	public void welcome() {
		System.out.println("invoking welcome in HassanCity");
		super.welcome();
	}

	@Override
	public void welcome(String name) {
		super.welcome(name);
	}

	@Override
	public void welcome(String name, String country) {
		super.welcome(name, country);
	}

	@Override
	public void welcome(String name, String country, int population) {
		super.welcome(name, country, population);
	}

	@Override
	public void welcome(String name, String country, int population, double area) {
		super.welcome(name, country, population, area);
	}

	@Override
	public void welcome(String name, String country, int population, double area, String mayor) {
		super.welcome(name, country, population, area, mayor);
	}

}
