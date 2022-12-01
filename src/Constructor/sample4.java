package Constructor;

public class sample4
{
int num3;      //50
int num4;      //20
//User defined constructor->Provided by user
//Use1: To initialize global variable
//Use2: Copy all members of class into object

sample4()     // Without or zero parameter Constructor
{
	num3=50;
	num4=20;

}
public void sub()
	{
System.out.println("Subtraction of Two int numbers:"+(num3-num4));
	}
public void div()
	{
System.out.println("Division of Two Numbers:"+(num3/num4));
	}

}
