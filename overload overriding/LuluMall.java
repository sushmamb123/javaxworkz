package overriding.com.star;

public class LuluMall extends Mall {
	@Override
	public void invite() {
		System.out.println("invoking invite in LuluMall");
		super.invite();
	}

	@Override
	public void invite(String name) {
		super.invite(name);
	}

	@Override
	public void invite(String name, String location) {
		super.invite(name, location);
	}

	@Override
	public void invite(String name, String location, double dailyProfit) {
		super.invite(name, location, dailyProfit);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay) {
		super.invite(name, location, dailyProfit, peopleVisitPerDay);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay, boolean isThereGST) {
		super.invite(name, location, dailyProfit, peopleVisitPerDay, isThereGST);
	}

}
