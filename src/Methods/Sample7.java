package Methods;

public class Sample7 
{
public static void main(String[] args)
{
	m1();       // call from same class
Sample7 s7=new Sample7();
s7.m3();
Sample8.m2();
Sample8 s8=new Sample8();
s8.m4();

}






// Static regular method
public static void m1() 

{
	System.out.println("Running static regular method m1 from same class");
	
}
public void m3()
{
	System.out.println("Running non static regular method m3 from same class");
	
}
}
