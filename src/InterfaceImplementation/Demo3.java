package InterfaceImplementation;
//implementation class
//example of multiple inheritance using interface

public class Demo3 implements I1,I2
{
public void m1()
{
	System.out.println("method m1 from interface I1 completed in IC");
}
public void m2()
{
	System.out.println("method m2 from interface I1 completed in IC");
}
public void m3()
{
	System.out.println("method m3 from interface I2 completed in IC");
}
public void m4()
{
	System.out.println("method m4 from interface I2 completed in IC");
}
public static void main(String[] args) 
{
	Demo3 d3=new Demo3();
	d3.m1();
	d3.m2();
	d3.m3();
	d3.m4();
}

}
