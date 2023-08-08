class Brick{
	static String fullName;
	static String used;
	int size;
	String colour;
	Brick(int size,String colour)
	{
		System.out.println("invoking int and String constructor of Brick");
		this.size=size;
		this.colour=colour;
	}
	static{
		fullName="Brazil";
		used="Construction";
		System.out.println("invoking static method in Brick");
	}

	static void printStatic(){
		System.out.println("Running printStatic in Brick");
		System.out.println("fullName of Brick:"+fullName);
		System.out.println("Used in Brick:"+used);
	}
	void printInstance(){
	    System.out.println("Running printVoid in Brick");
		System.out.println("Size of Brick:"+size);
		System.out.println("Colour of Brick:"+colour);
	}
	public static void main(String[] args){
		System.out.println("invoking main in Brick");
		Brick brick=new Brick(90,"White");
		brick.printInstance();
		brick.printStatic();
		}
}