class Wood{
	String properties;
	String scientist;
	int years;
	String colour;
	float thickness;
	Wood()
	{
		System.out.println("invoking the const in Wood");
	}
	Wood(String properties)
	{
		this.properties=properties;
		System.out.println("invoking with String arguments");
	}
	Wood(String properties,String scientist)
	{
		this.properties=properties;
		this.scientist=scientist;
		System.out.println("invoking with String and String arguments");
	}
	Wood(String properties,String scientist,int years)
	{
		this("properties","scientist");
		this.years=years;
		System.out.println("invoking with String String and int arguments");
	}
	Wood(String properties,String scientist,int years,String colour)
	{
		this("properties","scientist",years);
		this.colour=colour;
		System.out.println("invoking with String String int and String arguments");
	}
	Wood(String properties,String scientist,int years,String colour,float thickness)
	{
		this("properties","scientist",years,"colour");
		this.thickness=thickness;
		System.out.println("invoking with String String int String and float arguments");

	}
}