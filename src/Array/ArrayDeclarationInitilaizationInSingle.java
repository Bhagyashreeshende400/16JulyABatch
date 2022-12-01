package Array;

import java.util.Arrays;

public class ArrayDeclarationInitilaizationInSingle 
{
public static void main(String[] args) 
{
String[]ar= {"Mahesh","Rajesh","Atul","Shekhar"};	

System.out.println("Print Original Data");
for(int i=ar.length-1;i>=0;i--) 
{
	System.out.println(ar[i]);
	

}
System.out.println("After Sorting");
Arrays.sort(ar);
for(int i=0;i<=ar.length;i++)
{
	System.out.println(ar[i]);
}
for(int i=0;i<=ar.length;i++)
{
	System.out.println(ar[i]);
}
}
}
