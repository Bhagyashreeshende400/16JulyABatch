package ExceptionHandling;

public class Example_9 
{
public static void main(String[] args) 
{
	System.out.println("Before arrival of Exception");
int i=10;
int j=5;
try 
{
	int k=i/j;
System.out.println("try 2nd line");
System.out.println("try 3rd line");
System.out.println(k);
}
catch(ArithmeticException s)
{
	System.out.println("Catch of Arithmetic Exception is ruuning");
}
finally
{
	System.out.println("Finally Block is running");
}
System.out.println("After handling of Exception");





}
}
