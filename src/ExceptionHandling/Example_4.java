package ExceptionHandling;

public class Example_4 
{
public static void main(String[] args) 
{
	int[]ar=new int[4];
	
try
{
	ar[6]=10;
}
catch(ArithmeticException e) 
{
	System.out.println("Arithmatic Exception handled");
}
catch(StringIndexOutOfBoundsException c)
{
	System.out.println("StringIndexOutOfBounds exception handled");
}
catch(ArrayIndexOutOfBoundsException b)
{
	System.out.println("ArrayIndexOutOfBounds Exception handled");
}
System.out.println("Hiii");
System.out.println("Hello");

}
}
