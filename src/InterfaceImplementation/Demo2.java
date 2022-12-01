package InterfaceImplementation;

//implementation class
public class Demo2 implements Demo1
{
public void m1()
{
	System.out.println(a);
System.out.println("method m1 from interface demo completed in IC");
}
public void m2()
{
	System.out.println("method m2 from interface demo completed in IC");
}
public static void main(String[] args) 
{
Demo2 d2=new Demo2();
d2.m1();
d2.m2();
	
	
}

}
