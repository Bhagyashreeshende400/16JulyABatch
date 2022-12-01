package MethodWithReturnType;

public class Demo1 
{
public static void main(String[] args) 
{
	int num=add(19,10);
	System.out.println(num);
	System.out.println("....");
	Demo2 s=new Demo2();
	int mop=s.sub(30,10);
	System.out.println(mop);
}
	
public static int add(int a,int b)
	{
		int add=a+b;
		return add;
	}
}

