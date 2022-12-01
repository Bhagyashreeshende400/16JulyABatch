package Methods;

public class Sample4

// nonstatic method call from same class
{
public static void main(String[] args)
{
	Sample4 s4=new Sample4();
	s4.m5();
	{
		System.out.println("Hi");
	
	}
	

	s4.m6();
	
	{
		System.out.println("GM");
	}
}
		






// non static regular method
public void m5()
{
	System.out.println(" Running non static regular method:m5");
	
}
// non static regular method
public void m6()
{ 
	System.out.println("Running nonstatic regular method: m6");
	
}
}
	
	
	
	
	
