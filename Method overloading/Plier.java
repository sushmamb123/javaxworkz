package chaining.examples;

public class Plier {
	public String types;
	public float length;

	public void cutting() {
		System.out.println("invoking with cutting in Plier");
		cutting("Oil Filter");
		cutting(155.2f);
	}

	public void cutting(String types) {
		System.out.println("invoking String in cutting");
		System.out.println("Plier types:" + types);
	}

	public void cutting(float length) {
		System.out.println("invoking double in cutting");
		System.out.println("Plier length:" + length);

	}

	public void cutting(String types, float length) {
		System.out.println("invoking String float in cutting");
		cutting(types);
		cutting(length);

	}


}






