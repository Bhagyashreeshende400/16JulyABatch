package ArraySorting;

import java.util.Arrays;

public class Ex1_ArraySort 
{
public static void main(String[] args)
{
	
int[]ar1=new int[4];
ar1[0]=30;
ar1[1]=20;	
ar1[2]=40;	
ar1[3]=10;	

System.out.println("***Original data");
for(int i=0; i<=ar1.length-1;i++)
{
	System.out.println(ar1[i]);
}
	
System.out.println("--print info in ascending order--");

	Arrays.sort(ar1);
    for(int j=0;j<=ar1.length-1;j++)
{
	System.out.println(ar1[j]);
}
System.out.println("--print info in descending order--");
for(int k=ar1.length-1;k>=0; k--)
{
	System.out.println(ar1[k]);
}
}
}






