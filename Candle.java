class Candle{
	static String aim;
	static String formula;
	String properties;
	String symbol;
	Candle(String properties,String symbol)
	{
		System.out.println("invoking String and String constructor of Candle");
		this.properties=properties;
		this.symbol=symbol;
	}
	static{
		aim="Light";
		formula="CnH2n+2";
		System.out.println("invoking static method in Candle");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Candle");
		System.out.println("Aim of the Candle:"+aim);
		System.out.println("Formula of Candle:"+formula);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Candle");
		System.out.println("properties of Candle:"+properties);
		System.out.println("Symbol of Candle:"+symbol);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Candle");
		Candle candle=new Candle("Shape","Joy");
		candle.printInstance();
		candle.printStatic();
		}
}