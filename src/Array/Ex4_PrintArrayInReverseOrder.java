package Array;

public class Ex4_PrintArrayInReverseOrder 
{
public static void main(String[] args) 
{
	
int []ar1=new int[4];

ar1[0]=30;
ar1[1]=20;
ar1[2]=40;
ar1[3]=10;

System.out.println("****Print Original Data");

for(int i=0; i<=ar1.length-1; i++)
{
	System.out.println(ar1[i]);
}
System.out.println("****Print Reverse Data");

for(int i=ar1.length-1; i>=0; i--)
{
	System.out.println(ar1[i]);
}


}
	
	
	
	
}
