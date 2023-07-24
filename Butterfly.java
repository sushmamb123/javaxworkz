class Butterfly{
	static String order;
	static String phylum;
	String domain;
	String kingdom;
	Butterfly(String domain,String kingdom)
	{
		System.out.println("invoking String and String constructor of Butterfly");
		this.domain=domain;
		this.kingdom=kingdom;
	}
	static{
		order="lepidoptera";
		phylum="Arthropoda";
		System.out.println("invoking static method in Butterfly");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Butterfly");
		System.out.println("Order of Butterfly:"+order);
		System.out.println("Phylum of Butterfly:"+phylum);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Butterfly");
		System.out.println("Domain of Butterfly:"+domain);
		System.out.println("Kingdom of Butterfly:"+kingdom);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Butterfly");
		Butterfly butterfly=new Butterfly("Eukaryota","animalia");
		butterfly.printInstance();
		butterfly.printStatic();
		}
}