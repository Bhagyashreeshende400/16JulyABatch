package thisSuperkeyword;

public class sample6 extends sample5
//subclass
{
//int a=30.b=70   //superclass variable
	int c=20, d=30;    //global Variable

	public void add()
	{
		int e=30, f=40;     //local variable
		System.out.println("local variable:"+(e+f));
		System.out.println("superclass variable:"+(a+b));
		System.out.println("global variable:"+(c+d));
	}


}
