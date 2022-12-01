package Array;

public class Ex1_StringArray 
{
public static void main(String[] args) 
{
	//Step 1: Array Declaration
	String[]ar=new String[5];   
	// Step 2: Array Initialization
ar[0]="Rahul Patil";
ar[1]="Ramesh Patil";
ar[2]="Rajesh Patil";
ar[3]="Raj Patil";
ar[4]="Rajiv Patil";

//Step 3: Array Usage
System.out.println(ar[3]);
System.out.println(ar.length);

System.out.println("****Put all Information into Array*****");

for(int i=0; i<=ar.length-1; i++)
{
	System.out.println(ar[i]);
}
}
	
	
}
