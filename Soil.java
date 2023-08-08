class Soil{
	static String plantSoil;
	static String reffered;
	int ph;
	String layer;
	Soil(int size,String colour)
	{
		System.out.println("invoking int and String constructor of Soil");
		this.ph=ph;
		this.layer=layer;
	}
	static{
		plantSoil="Loamy Soil";
		reffered="Earth";
		System.out.println("invoking static method in Soil");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Soil");
		System.out.println("Soil in PlantSoil:"+plantSoil);
		System.out.println("Soil reffered as:"+reffered);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Soil");
		System.out.println("Ph of Soil:"+ph);
		System.out.println("Layer of Soil:"+layer);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Soil");
		Soil soil=new Soil(10,"Subsoil");
		soil.printInstance();
		soil.printStatic();
		}
}