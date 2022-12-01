package Inheritance;

public class subclass extends parentclass
{
public void area()
{
	int side=5;
	System.out.println("area of square:"+(side*side));
}
	
	
// Call from main class from other class

	public static void main(String[]args)
	{
	subclass s1=new subclass();
	System.out.println("****Method of subclass******");
	s1.area();
	System.out.println("..");
	System.out.println("****Method of superclass****");
	s1.add();
	s1.sub();
	s1.div();
	}
}

	