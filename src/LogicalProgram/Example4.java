package LogicalProgram;

import java.util.Scanner;

public class Example4 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Student Name:"+" ");
String scv = scn.next();
	System.out.println(scv.length());
	System.out.println(scv.contains("B"));
	System.out.println(scv.isEmpty());
	
}
}
