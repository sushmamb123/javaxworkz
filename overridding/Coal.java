package overriding.com;

public class Coal {

	public void burn() {
		System.out.println("invoking burn in Coal");
	}

	public void burn(String name) {
		System.out.println("invoking String in burn");
	}

}
