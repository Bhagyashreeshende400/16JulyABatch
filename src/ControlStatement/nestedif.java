package ControlStatement;

public class nestedif 
{
public static void main(String[] args) 
{
int prescore=150;
if(prescore>=200)
	
{
	System.out.println("You are eligible for mains exam");
	int mainscore=900;
	if(mainscore>=700)
	{
		System.out.println("Congratulationsyou are selected");
	}
}
else
{
	System.out.println("you are not Selected");
	System.out.println("***Best Luck for next time");
}
}
}