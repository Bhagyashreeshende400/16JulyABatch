package ExceptionHandling;

public class Example_7 
{
public static void main(String[] args) 
{
	int []m1=new int[4];
	 	
	try 
	{
		m1[5]=10;
	}
catch(ArithmeticException d) 
	{
	System.out.println("Arithmetic Exception Handled");
}
catch(StringIndexOutOfBoundsException b)
	{
	System.out.println("String Index Out Of Bounds Exception Handled" );
	}
	catch(ArrayIndexOutOfBoundsException b) 
	{
		System.out.println("Array Index Out Of Bounds Exception Handled");
	}
	catch(Exception c)
	{
		System.out.println("Generic Exception Handled");
	}

	System.out.println("Hii");


}
}
