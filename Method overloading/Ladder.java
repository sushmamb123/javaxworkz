package chaining.examples;

public class Ladder {
	public int noOfSteps;
	public float height;

	public void climbs() {
		System.out.println("invoking with climbs in Ladder");
		climbs(15);
		climbs(12.2f);
	}

	public void climbs(int noOfSteps) {
		System.out.println("invoking int in climbs");
		System.out.println("Ladder noOfSteps:" + noOfSteps);
	}

	public void climbs(float height) {
		System.out.println("invoking float in climbs");
		System.out.println("Ladder height:" + height);

	}

	public void climbs(int noOfSteps, float height) {
		System.out.println("invoking int float in climbs");
		climbs(noOfSteps);
		climbs(height);

	}


}
