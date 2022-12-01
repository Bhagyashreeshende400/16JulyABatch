package TypesOfVariable;

public class sample2
{
static int a=10;       //static global variable
public static void main(String[] args) 
{
	// Static global variable call from same class
	System.out.println(a);     // Variable name
System.out.println("......");
// Static global variable call from diff class

System.out.println(sample3.b);
}

}
