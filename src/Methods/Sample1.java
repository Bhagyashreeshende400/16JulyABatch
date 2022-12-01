package Methods;

public class Sample1 
// Ex.1 Static regular method call from same class
// main method
{
public static void main(String[]args)
{
System.out.println("Hi");
m1();                         //methodname();
m2();
System.out.println("Good Morning");
}
// Static Regular method
public static void m1()      // User defined

{
	System.out.println("Running static regular method: m1");
	
}
// Static Regular Method
public static void m2()          //User Defined

{
	System.out.println("Running static regular method: m2");
}
}
