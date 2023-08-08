class Helmet{
	static String protect;
	static String headBand;
	double price;
	String types;
	Helmet(double price,String types)
	{
		System.out.println("invoking double,String constructor of Helmet");
		this.price=price;
		this.types=types;
	}
	static{
		protect="Head";
		headBand="Inside Helmet";
		System.out.println("invoking static method in Helmet");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Helmet");
		System.out.println("Helmet Protect:"+protect);
		System.out.println("Helmet HeadBand:"+headBand);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Helmet");
		System.out.println("Helmet Price:"+price);
		System.out.println("Helmet Types:"+types);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Helmet");
		Helmet helmet=new Helmet(130d,"Sports Gear");
		helmet.printInstance();
		helmet.printStatic();
		}
}