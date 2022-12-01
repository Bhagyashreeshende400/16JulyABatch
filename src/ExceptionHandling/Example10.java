package ExceptionHandling;

public class Example10 
{
public static void main(String[] args) 
{
	int[]ar=new int[3];
	
			
try 
{
	ar[0]=1;
}
catch(ArrayIndexOutOfBoundsException data)
 {
	System.out.println("Array Index Out Of Bounds Exception Handled");
}

try 
{
	ar[1]=11;
}
catch(ArrayIndexOutOfBoundsException data)
 {
	System.out.println("Array Index Out Of Bounds Exception Handled");
}

try 
{
	ar[2]=10;
}
catch(ArrayIndexOutOfBoundsException data)
 {
	System.out.println("Array Index Out Of Bounds Exception Handled");
}
try 
{
	ar[4]=12;
}
catch(ArrayIndexOutOfBoundsException data)
 {
	System.out.println("Array Index Out Of Bounds Exception Handled");
}

System.out.println("Good Morning");

}
}
