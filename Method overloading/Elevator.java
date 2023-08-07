package chaining.examples;

public class Elevator {
	public String status;
	public int age;

	public void escalator() {
		System.out.println("invoking with escalator in Elevator");
		escalator("Active");
		escalator(15);
	}

	public void escalator(String status) {
		System.out.println("invoking String in escalator");
		System.out.println("Elevator status:" + status);
	}

	public void escalator(int age) {
		System.out.println("invoking int in company");
		System.out.println("Elevator age:" + age);

	}

	public void escalator(String status, int age) {
		System.out.println("invoking String int in company");
		escalator(status);
		escalator(age);

	}

}
