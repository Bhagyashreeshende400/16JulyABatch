package AbstractConcrete;

abstract public class Sample1 
{

public void add(int a, int b)    // Method Declaration
{
	System.out.println("Add:"+(a+b));// Method Defination
	
}
	public void sub(int a, int b)    // Method Declaration
	{
		System.out.println("Sub:"+(a-b));// Method Defination
		
	}
	
	abstract public void div(int a, int b);   // Method Declaration
	
}
