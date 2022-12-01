package Inheritance;

public class example2
{
public static void main(String[] args) 
{
	//son1 Property
	System.out.println(".....Son1 Property.....");
	son1 f1=new son1();
	f1.mobile();
	f1.car();
	f1.money();
	f1.home();
System.out.println("....Son2 Property....");
	
son2 f2=new son2();
f2.laptop();
f2.car();
f2.money();
f2.home();
	
System.out.println("....Son3 Property....");

son3 f3=new son3();
f3.bike();
f3.car();
f3.money();
f3.home();
		}
}
