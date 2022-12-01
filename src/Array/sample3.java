package Array;

import java.util.Arrays;

public class sample3 
{
public static void main(String[] args) 
{
	
String[]ar=new String[4];
ar[0]="Ram";
ar[1]="Raj";
ar[2]="Rahul";
ar[3]="prem";
System.out.println("****Orignal Data****");
for(int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
}
Arrays.sort(ar);
System.out.println("***After Sorting***");

for(int i=0;i<=ar.length-1;i++) 
{
	System.out.println(ar[i]);
}

}
}