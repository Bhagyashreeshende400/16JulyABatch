package accessSpecifiers;

public class Sample2

// example of default access specifier
{
int num;      // Default Specifier
Sample2()	// Default Specifier
{
	num=10;
}
void m2()	// default 
{
	System.out.println(num);
}
	
	public static void main(String[] args) 
{
	Sample2 s2=new Sample2();
	s2.m2();
	System.out.println(s2.num);
}
}
