package LogicalProgram;

public class Example1_Palindrome 
{
public static void main(String[] args)
{
	String org="RaRa";
	String rev="";
for(int i=org.length()-1;i>=0;i--)
{
	rev=rev+org.charAt(i);
}
System.out.println("original string :"+ org);
System.out.println("reverse string :"+ rev);
if(org.equals(rev))
{
	System.out.println("Given String is Palindrome");
}
else
{
	System.out.println("Given String is not Palindrome ");
}
}
}
