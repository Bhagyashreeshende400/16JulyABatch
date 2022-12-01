package Constructor;

public class sample1 
{
// sample1()
//	{
		
//	}

public void m1() 
{
System.out.println("running Non Static regular Method m1 from same class");
}
public static void main(String[] args) 
{
sample1 f1=new sample1();   // call from same class
f1.m1();

sample2 s2=new sample2();    // call from diff class
s2.m2();
}
}




	
	