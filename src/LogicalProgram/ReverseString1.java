package LogicalProgram;

public class ReverseString1 
{
public static void main(String[] args) 
{
	String org="mame";
	String rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	if(org.equals(rev))
	{
		System.out.println("Palindrome");
	}
	
	else
	{
		System.out.println("NOt Palindrome");
	}
	
	
}
}
