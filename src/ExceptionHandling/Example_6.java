package ExceptionHandling;

public class Example_6 
{
public static void main(String[] args) 
{
	String box="Patent";
try 
{
System.out.println(box.charAt(4));	//risky code
}
catch(ArithmeticException e) 
{
	System.out.println("Arithmetic Exception Handled");
}
catch(StringIndexOutOfBoundsException a) {
	System.out.println("String Index Out Of Bounds Exception Handled");
}
catch(ArrayIndexOutOfBoundsException b) 
{
	System.out.println("Array Index Out Of Bounds Exception Handled");
}
catch(Exception c)
{
	System.out.println("Generic Exception Handled");
}

System.out.println("Today is Wednesday");
System.out.println("Tommarow is Thursday");


}
}
