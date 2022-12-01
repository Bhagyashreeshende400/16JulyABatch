package ExceptionHandling;

public class Example_2 
{
public static void main(String[] args) 
{
	String s1="Shekhar";  //0 to 6

try 
{
	System.out.println(s1.charAt(2));

}
catch(StringIndexOutOfBoundsException s)
{
	System.out.println("String Index Out Of Bounds Exception Handled");
System.out.println("Finally Output shown.....");

}


}
}
