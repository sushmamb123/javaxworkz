package unique.com.acer;

public class Hospital {
	public Doctor doctor;
	public void shop() {
		if(this.doctor!=null) {
			this.doctor.treatement();
			System.out.println("invoking treatement in Hospital");
		}
		else {
			System.err.println("not invoking treatement in Hospital");
			}
	}
	public void specialist() {
		if(this.doctor!=null) {
			this.doctor.kidneySpecialist();
			System.out.println("invoking kidneySpecialist in Hospital");
			}
		else {
			System.err.println("not invoking kidneySpecialist in Hospital");

		}
	}
	public Nurse nurse;
	public void work(){
		if(this.nurse!=null) {
			this.nurse.injection();
			System.out.println("invoking injection in Hospital");
			}
		else {
			System.err.println("not invoking injection in Hospital");
		}
	}
	public void location() {
		if(this.nurse!=null) {
			this.nurse.bloodTest();
			System.out.println("invoking bloodTest in Hospital");
		}
		else {
			System.err.println("not invoking bloodTest in Hospital");
		}
	}
	public Patient patient;
	public void name() {
		if(this.patient!=null) {
			this.patient.disease();
			System.out.println("invoking diease in Hospital");
		}
		else {
			System.err.println("not invoking diease in Hospital");
		}
	}
	public void address() {
		if(this.patient!=null) {
			this.patient.tablet();
			System.out.println("not invoking tablet in Hospital");
			}
		else {
			System.err.println("not invoking tablet in Hospital");
		}
	}
	

}
