package overriding.com;

public class Organism extends Amoeba {
	@Override
	public void cell() {
		System.out.println("invoking cell in Organisms");
		super.cell();
	}

}
