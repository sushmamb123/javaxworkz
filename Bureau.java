class Bureau{
	static String englishName;
	static String wordFrom;
	int creditScore;
	String anotherName;
	Bureau(int creditScore,String anotherName)
	{
		System.out.println("invoking int and String constructor of Bureau");
		this.creditScore=creditScore;
		this.anotherName=anotherName;
	}
	static{
		englishName="Agency";
		wordFrom="French Bureau";
		System.out.println("invoking static method in Bureau");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Bureau");
		System.out.println("English name:"+englishName);
		System.out.println("Bureau Word from:"+wordFrom);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Bureau");
		System.out.println("Bureau Credit score:"+creditScore);
		System.out.println("Bureau Another name:"+anotherName);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Bureau");
		Bureau bureau=new Bureau(850,"Desk");
		bureau.printInstance();
		bureau.printStatic();
		}
}