package ControlStatement;

public class example4_nested1 
{
public static void main(String[] args) 
{
int pem=350;                                //200>=300
if(pem>=300)                                //Outer if  
{
	System.out.println("Eliglible for mains exam");
	int mem=600;
	if(mem>=700)
	{
		System.out.println("Got Selected");
		
	}
	else
	{
		System.out.println("Rejectedfrom main exam");
		
	}
}
else
{
	System.out.println("Not Eligible for mains exam");
}
	
	
}
}
