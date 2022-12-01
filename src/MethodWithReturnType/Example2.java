package MethodWithReturnType;

public class Example2 
{
public static void main(String[] args)
{
int sub1=sub(50,10);
	System.out.println("subtraction: "+sub1);
	System.out.println("Subtraction: "+sub(30,10));	
}
public static int sub(int a, int b)
{
	int sub=a-b;
	return sub;
}
}
