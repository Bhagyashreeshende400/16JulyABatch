package Constructor;

public class sample8 
{
int num1;
int num2;


// User defined with 2 int parameter constructor

sample8(int a, int b)	
{
	num1=a;
	num2=b;    // assign local variable info global variable
}
public void add()       // Non-static method
{
	System.out.println("add:"+(num1+num2));
}	
public void mul()	// Non-static method
{
	System.out.println("mul:"+(num1*num2));
}
public void sub()	// Non-static method
{
	System.out.println("sub:"+(num1-num2));
}



public static void main(String[] args) 
{
// Non static method call from same class
	
	
sample8 d1=new sample8(10,20);    // d1-->first object
d1.add();
d1.mul();	
d1.sub();	

System.out.println(".........");

sample8 d2=new sample8(20,30);     // d2-->first object
d2.add();
d2.mul();
d2.sub();


}

}
