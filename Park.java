class Park{
	String type;
	String things;
	String name;
	String word;
	int size;
	float dimensions;
	String nationalPark;
	String nature;
	String see;
	Park()
	{
		System.out.println("invoking the const in Park");
	}
	Park(String type)
	{
		this.type=type;
		System.out.println("invoking with String arguments");
	}
	Park(String type,String things)
	{
		this.type=type;
		this.things=things;
		System.out.println("invoking with String and String arguments");
	}
	Park(String type,String things,String name)
	{
		this("type","things");
		this.name=name;
		System.out.println("invoking with String String and String arguments");
	}
	Park(String type,String things,String name,String word)
	{
		this("type","things","name");
		this.word=word;
		System.out.println("invoking with String String String and String arguments");
	}
	Park(String type,String things,String name,String word,int size)
	{
		this("type","things","name","word");
		this.size=size;
		System.out.println("invoking with String String String String and int arguments");
	}
	Park(String type,String things,String name,String word,int size,float dimensions)
	{
		this("type","things","name","word",size);
		this.dimensions=dimensions;
		System.out.println("invoking with String String String String int and float arguments");
	}
	Park(String type,String things,String name,String word,int size,float dimensions,String nationalPark)
	{
		this("type","things","name","word",size,dimensions);
		this.nationalPark=nationalPark;
		System.out.println("invoking with String String String String int float and String arguments");
	}
	Park(String type,String things,String name,String word,int size,float dimensions,String nationalPark,String nature)
	{
		this("type","things","name","word",size,dimensions,"nationalPark");
		this.nature=nature;
		System.out.println("invoking with String String String String int float String and String arguments");
	}
	Park(String type,String things,String name,String word,int size,float dimensions,String nationalPark,String nature,String see)
	{
		this("type","things","name","word",size,dimensions,"nationalPark","String nature");
		this.see=see;
		System.out.println("invoking with String String String String int float String String and String arguments");
	}
}
	
	
	
	
	
	
	
	
	