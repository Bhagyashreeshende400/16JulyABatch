package thisSuperkeyword;

public class sample2 extends sample1

//Subclass
{
// int a=10        //Global Variable from Super class
	int a=20;  //  Global Variable   
public void m1()
{
	int a=30;       //Local Variable
	
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);



}
	
	
}
