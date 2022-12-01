package MethodWithReturnType;

public class Example7
{
public static void main(String[] args) 
{
	Example7 e4=new Example7();
	
	int memo=e4.length("Har Har Mahadev");
	System.out.println("Total: "+memo);
	
}
	public int length(String name)
	
	{
		int s3=name.length();
	return s3;
}
}
