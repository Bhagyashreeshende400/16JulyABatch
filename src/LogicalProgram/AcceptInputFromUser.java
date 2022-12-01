package LogicalProgram;

import java.util.Scanner;

public class AcceptInputFromUser
{
public static void main(String[] args)
{
	Scanner s1=new Scanner (System.in);
	System.out.print("Enter num1: ");
	int num1 = s1.nextInt();               //use to accept int input from user
	System.out.print("Enter num2: ");		
	int num2 = s1.nextInt();
	System.out.println(num1+num2);
	System.out.print("Enter Student name: ");
	String s2 = s1.next();
	System.out.println(s2.length());
	}
}










