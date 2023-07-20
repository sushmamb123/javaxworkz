class Carrom{
String board;
String countries;
double height;
float width;
String equipment;
Carrom()
{
	System.out.println("invoking no-arg of Carrom");
}
Carrom(String board)
{
	System.out.println("invoking the const of Carrom");
	System.out.println("carrom board"+board);
	this.board=board;
}
Carrom(String board,String countries)
{
    System.out.println("invoking the const of Carrom");
	System.out.println("carrom board"+board);
	System.out.println("carrom asian countries"+countries);
	this.board=board;
	this.countries=countries;	
}
Carrom(String name,String countries,double height)
{
	System.out.println("invoking the const of Carrom");
	System.out.println("carrom board"+board);
	System.out.println("carrom in asian countries"+countries);
	System.out.println("carrom height"+height);
	this.board=board;
	this.countries=countries;
	this.height=height;	
}
Carrom(String name,String countries,double height,float width)
{
	System.out.println("invoking the const of Carrom");
	System.out.println("carrom board"+board);
	System.out.println("carrom in asian countries"+countries);
	System.out.println("carrom height"+height);
	System.out.println("carrom width"+width);
	this.board=board;
	this.countries=countries;
	this.height=height;
	this.width=width;	
	
}
Carrom(String name,String countries,double height,float width,String equipment)
{
	System.out.println("invoking the const of Carrom");
	System.out.println("carrom board"+board);
	System.out.println("carrom in asian countries"+countries);
	System.out.println("carrom height"+height);
	System.out.println("carrom width"+width);
	System.out.println("carrom equipment"+equipment);
	this.board=board;
	this.countries=countries;
	this.height=height;
	this.width=width;
	this.equipment=equipment;	
}
public static void main(String[] args)
{
	System.out.println("invoking main in Carrom");
	Carrom carrom=new Carrom();
	System.out.println(carrom.board);
	System.out.println(carrom.countries);
	System.out.println(carrom.height);
	System.out.println(carrom.width);
	System.out.println(carrom.equipment);
	System.out.println("-----------------------------");
	Carrom carrom1=new Carrom("Square");
	System.out.println(carrom1.board);
	System.out.println("==================================");
	Carrom carrom2=new Carrom("Square","Japan");
	System.out.println(carrom2.board);
	System.out.println(carrom2.countries);
	System.out.println("++++++++++++++++++++++++++++++++");
	Carrom carrom3=new Carrom("Square","Maldives",1.9);
	System.out.println(carrom3.board);
	System.out.println(carrom3.countries);
	System.out.println(carrom3.height);
	System.out.println("++++++++++++++++++++++++++++++++");
	Carrom carrom4=new Carrom("Square","Maldives",1.9,6.35f);
	System.out.println(carrom3.board);
	System.out.println(carrom3.countries);
	System.out.println(carrom3.height);
	System.out.println(carrom3.width);
	System.out.println("++++++++++++++++++++++++++++++++");
	Carrom carrom5=new Carrom("Square","Maldives",1.9,6.35f,"Net");
	System.out.println(carrom4.board);
	System.out.println(carrom4.countries);
	System.out.println(carrom4.height);
	System.out.println(carrom4.width);
	System.out.println(carrom4.equipment);
	System.out.println("**********************************");

	
}
}


