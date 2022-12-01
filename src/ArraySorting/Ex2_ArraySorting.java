package ArraySorting;

import java.util.Arrays;

public class Ex2_ArraySorting 
{
public static void main(String[] args)
{
String[]d1=new String[5];

	d1[0]="Rahul";
	d1[1]="Rajesh";
    d1[2]="Rajiv";
    d1[3]="Raj";
    d1[4]="Rashmi";

System.out.println("....Orignal Data.....");
for(int i=0;i<=d1.length-1;i++)
{
	System.out.println(d1[i]);
}
Arrays.sort(d1);

System.out.println("....After Sorting....");
for(int i=0;i<=d1.length-1;i++)
{
	System.out.println(d1[i]);
}

}	
}
