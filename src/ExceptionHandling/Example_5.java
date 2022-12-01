package ExceptionHandling;

public class Example_5
{
public static void main(String[] args) 
{
	int []ar=new int[3];

try 
{
	ar[3]=10;
}
catch(Exception e) 
{
	e.printStackTrace();
	System.out.println("Generic Exception Handled");
}

System.out.println("Program Run");
}
}
