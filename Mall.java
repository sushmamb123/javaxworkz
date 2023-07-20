class Mall{
	String type;
	int cost;
	int howManyMalls;
	String firstCity;
	int floors;
	int shops;
	int noOfPeople;
	Mall()
	{
		System.out.println("invoking the const in Mall");
	}
	Mall(String type)
	{
		this.type=type;
		System.out.println("invoking with String arguments");
	}
	Mall(String type,int cost)
	{
		this.type=type;
		this.cost=cost;
		System.out.println("invoking with String and int arguments");
	}
	Mall(String type,int cost,int howManyMalls)
	{
		this("type",cost);
		this.howManyMalls=howManyMalls;
		System.out.println("invoking with String int and int arguments");
	}
	Mall(String type,int cost,int howManyMalls,String firstCity)
	{
		this("type",cost,howManyMalls);
		this.firstCity=firstCity;
		System.out.println("invoking with String int int and String arguments");
	}
	Mall(String type,int cost,int howManyMalls,String firstCity,int floors)
	{
		this("type",cost,howManyMalls,"firstCity");
		this.floors=floors;
		System.out.println("invoking with String int int String and int arguments");
	}
	Mall(String type,int cost,int howManyMalls,String firstCity,int floors,int shops)
	{
		this("type",cost,howManyMalls,"firstCity",floors);
		this.shops=shops;
		System.out.println("invoking with String int int String int and int arguments");
	}
	Mall(String type,int cost,int howManyMalls,String firstCity,int floors,int shops,int noOfPeople)
	{
		this("type",cost,howManyMalls,"firstCity",floors,shops);
		this.noOfPeople=noOfPeople;
		System.out.println("invoking with String int int String int int and int arguments");
	}


}