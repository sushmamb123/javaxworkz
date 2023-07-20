class Oil{
String name;
double viscocity;
int quantity;
Oil()
{
	System.out.println("invoking no-arg of Oil");
}
Oil(String name)
{
	System.out.println("invoking the const of Oil");
	System.out.println("oil name"+name);
	this.name=name;
}
Oil(String name,double viscocity)
{
    System.out.println("invoking the const of Oil");
	System.out.println("oil name"+name);
	System.out.println("viscocity of oil"+viscocity);
	this.name=name;
	this.viscocity=viscocity;	
}
Oil(String name,double viscocity,int quantity)
{
	System.out.println("invoking the const of Oil");
	System.out.println("oil name"+name);
	System.out.println("viscocity of oil"+viscocity);
	System.out.println("quantity of oil"+quantity);
	this.name=name;
	this.viscocity=viscocity;
	this.quantity=quantity;	
}
public static void main(String[] args)
{
	System.out.println("invoking main in Oil");
	Oil oil=new Oil();
	System.out.println(oil.name);
	System.out.println(oil.viscocity);
	System.out.println(oil.quantity);
	System.out.println("-----------------------------");
	Oil oil1=new Oil("Sunpure Gold");
	System.out.println(oil1.name);
	System.out.println("==================================");
	Oil oil2=new Oil("Goldwinner",9.00);
	System.out.println(oil2.name);
	System.out.println(oil2.viscocity);
	System.out.println("++++++++++++++++++++++++++++++++");
	Oil oil3=new Oil("Pam Oil",6.00,3);
	System.out.println(oil3.name);
	System.out.println(oil3.viscocity);
	System.out.println(oil3.quantity);
	System.out.println("++++++++++++++++++++++++++++++++");
	}
}


