package MethodWithReturnType;

public class Example4 
{
public static void main(String[] args) 
{
	Example4 e2=new Example4();
	int length=e2.getLengthOfString("Bhagyashree");
	System.out.println(length);
System.out.println(".......");
System.out.println(e2.getLengthOfString("Shekhar"));

System.out.println(".............");}
//method call from diff. class
Sample1 m=new Sample1();
int d1=m.div(50,2);
{
	System.out.println(d1);
	System.out.println(Sample1.div(12,2));
}

//Method with int return
	public int getLengthOfString(String name)

{
	int s1=name.length();
	return s1;
}
}

