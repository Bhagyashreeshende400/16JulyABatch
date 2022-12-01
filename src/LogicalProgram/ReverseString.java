package LogicalProgram;

public class ReverseString 
{
public static void main(String[] args) 
{
	String orignal="madam";
	String rev="";
	for(int i=orignal.length()-1;i>=0;i--)
	{
		rev=rev+orignal.charAt(i);
		
	}
if(orignal.equals(rev))
{
	System.out.println("String is Palindrome ");
}

else
{
	System.out.println("String is not Palindrome");
}
}
}
