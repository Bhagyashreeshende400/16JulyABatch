package ArraySorting;

import java.util.Arrays;

public class Ex3_FindHighestAndLowestNumberInArray 
{
public static void main(String[] args) 
{
	int[]m1=new int[4];
	m1[0]=30;
	m1[1]=20;
	m1[2]=10;
	m1[3]=40;
	Arrays.sort(m1);
System.out.println(m1[0]);
System.out.println(m1[m1.length-1]);
}
}
