package LogicalProgram;

import java.util.Scanner;

public class Ex2_FactorOfNumbers 
{
public static void main(String[] args) 
{
	System.out.println("Enter Num: ");
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int fact=1;
for(int i=num;i>=1;i--)
{
	 fact= fact*i;
	
}
System.out.println(fact);


}
}
