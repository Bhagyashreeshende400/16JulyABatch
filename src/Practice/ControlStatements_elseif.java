package Practice;

public class ControlStatements_elseif 
{
public static void main(String[] args)
{
	int marks=20;	
if(marks>=65)
{
	System.out.println("Result:"+"Distinction");
}
else if(marks>=60&marks<=64)
{
	System.out.println("Result:"+"FirstClass");
}
else if(marks>=50&marks<=59)
{
	System.out.println("Result:"+"SecondClass");
}
else if(marks>=35&marks<=49)
{
	System.out.println("Result:"+"Pass");
}
else if(marks<35)
{
	System.out.println("Result:"+"ATKT");
}
else
{
	System.out.println("Fail");
}
}
	
}
