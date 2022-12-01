package MethodWithReturnType;

public class Example1 
{
public static void main(String[] args) 
{
int num1= add(10,20);

System.out.println(num1);


System.out.println(".................");

System.out.println(add(100,50));    //150

System.out.println(add(8,2));      //10
}
//method with int return type
// public static void add()
public static int add(int a, int b)
	
{
	int sum=a+b;  //In return type replace void to int data type
	return sum;
	
}






}
