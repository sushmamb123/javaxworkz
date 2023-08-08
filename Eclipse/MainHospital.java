package unique.com.acer;

public class MainHospital {

	public static void main(String[] args) {
		System.out.println("invoking main in Hospital");
		Hospital hospital=new Hospital();
		hospital.shop();
		hospital.specialist();
		hospital.work();
		hospital.location();
		hospital.name();
		hospital.address();
		}

}
