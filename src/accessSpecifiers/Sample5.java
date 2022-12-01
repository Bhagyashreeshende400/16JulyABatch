package accessSpecifiers;

public class Sample5 

//example of public access specifier
{
public int num;
public Sample5()
{
	num=60;
	
}
public void m3()
{
	System.out.println(num);
}
public static void main(String[] args) 
{
	Sample5 s5=new Sample5();
	s5.m3();
	System.out.println(s5.num);
	
}
}
