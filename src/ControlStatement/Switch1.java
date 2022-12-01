package ControlStatement;

public class Switch1 
{
public static void main(String[] args)
{
	String inp="WT";
	switch(inp)
	{
	case "CD": System.out.println("running CD code");
	System.out.println("Cash Deposit");
	System.out.println("Cash withdraw");
	System.out.println("Cash Collect");
	System.out.println("Cash Receive");
	break;
	case "MT": System.out.println("running MT code");
	break;
	case "BI": System.out.println("running BI code");
	break;
	case "MS": System.out.println("running MS code");
	break;
	case "WT": System.out.println("running WT code");
	break;
    default: System.out.println("Invalid input");
	
	}
}
}
