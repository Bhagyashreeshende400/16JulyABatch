package Array;

import java.util.Arrays;

public class sample2 
{
public static void main(String[] args) 
{
	int[]ar= {10,30,70,87};
	System.out.println(ar[2]);
System.out.println(ar.length);
for(int i=0;i<=3;i++) 
{
	System.out.println(ar[i]);
}
Arrays.sort(ar);

System.out.println("descending order");
for(int i=4-1;i>=0;i--) 
{
	System.out.println(ar[i]);
}
}
}
