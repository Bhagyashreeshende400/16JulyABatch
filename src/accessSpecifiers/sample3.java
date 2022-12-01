package accessSpecifiers;

public class sample3 
//example of protected access specifier
{
protected int num;
protected sample3()
{
	num=40;
}
protected void name()
{
System.out.println(num);	
}
public static void main(String[] args) 
{
	sample3 s3=new sample3();
	s3.name();
	System.out.println(s3.num);
}
}

	
