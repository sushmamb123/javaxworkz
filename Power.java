class Power{
	static String siUnit;
	static String fatherOfPower;
	String sources;
	String elements;
	Power(String sources,String elements)
	{
		System.out.println("invoking String and String constructor of Power");
		this.sources=sources;
		this.elements=elements;
	}
	static{
		siUnit="Watt";
		fatherOfPower="Michael Faraday";
		System.out.println("invoking static method in Power");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Power");
		System.out.println("SI unit of power:"+siUnit);
		System.out.println("Father of Power:"+fatherOfPower);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Power");
		System.out.println("Sources of Power:"+sources);
		System.out.println("Elements of Power:"+elements);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Power");
		Power power=new Power("Expert","legitimate");
		power.printInstance();
		power.printStatic();
		}
}