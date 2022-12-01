package ExceptionHandling;


public class Example_1 
{
public static void main(String[] args) 
{
	int[]ar=new int[4];   //0 to 3

try 
{
	ar[2]=10;   //Risky Code
	}


	catch(ArrayIndexOutOfBoundsException e)
{
		System.out.println("Array Index Out Of Bounds Exception Handled");

System.out.println("Hi");
System.out.println("Hello");

}
}
}