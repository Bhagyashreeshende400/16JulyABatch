package Constructor;

public class sample3 
{

	int num1;      // 10
    int num2;      // 20
    sample3()      // without or zero parameter constructor
{
 num1=10;	
 num2=20;
}
public void add()
{
System.out.println("Addition of Two int:"+(num1+num2));
}
public void mul()
{
System.out.println("Multiplication of Two int:"+(num1*num2));	
	}
public static void main(String[] args)
{
sample3 b2=new sample3();    // call from same class
b2.add();
b2.mul();

System.out.println("............");

sample4 a4=new sample4();      // Call from diff class
a4.sub();
a4.div();
}
}
