package ExceptionHandling;

public class Example_8 
{
public static void main(String[] args)
{
	System.out.println("Before arrival of Exception");
	int i=10;
	int j=0;
	try 
	{
	int k=i/j;
	System.out.println(k);
	}
catch(ArithmeticException message)
	{
	System.out.println("Catch of Arithmetic Exception is running");
	}
System.out.println("After Handling of Exception");
}
}
