package ControlStatement;

public class  example3_elseif1 
{
public static void main(String[] args) 
{
int marks=30;
if(marks>=65)
{
	System.out.println("Distinction");
}
else if(marks>=60 & marks<=64)
{
    System.out.println("1st Class");
}
else if(marks>=50 & marks<=59)
{
    System.out.println("2nd Class");
}	

else if(marks>=35 & marks<=49)

{
	System.out.println("Pass");
}
else if(marks<35)
{
	System.out.println("Fail");
}
}

}

