package Methods;
public class Sample5

// non static method call from diff class
{
public static void main(String[]args)
{
Sample6 s6=new Sample6();
s6.m7();
{ 
	System.out.println("Hi");
	}
s6.m8();
{
	System.out.println("GM");
}
}
}