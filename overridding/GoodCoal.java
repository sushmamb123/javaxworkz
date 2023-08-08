package overriding.com;

public class GoodCoal extends Coal {
	@Override
	public void burn() {
		super.burn();
		System.out.println("invoking burn in GoodCoal");
	}

}
