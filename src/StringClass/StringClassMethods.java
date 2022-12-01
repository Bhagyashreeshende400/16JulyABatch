package StringClass;

public class StringClassMethods 
{
public static void main(String[] args) 
{
	String s1="velocity";
	String s2="ABCD";
	String s3="VELOCITY";
	String s4="The girl is beautiful";
	String s5="";
	String s6="abcabcab";
	
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(2, 5));
System.out.println(s1+" "+s3);

System.out.println(s1+s3);
System.out.println(s2.concat(s3));
System.out.println(s4.replace("beautiful", "good"));

s4=s4.replace("beautiful", "good");//Permanent Save String Variable
System.out.println(s4);
System.out.println(s3.length());

System.out.println(s4.toUpperCase());
s4=s4.toUpperCase();
System.out.println(s4);

System.out.println(s2.toLowerCase());

System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println("...............");

System.out.println(s4.contains("IS"));
System.out.println(s4.contains("girl"));
System.out.println(s4.contains("GIRL"));
System.out.println(s5.isEmpty());
System.out.println("............");
System.out.println(s1.charAt(4));
System.out.println(s1.indexOf('t'));
System.out.println(s1.lastIndexOf('y'));
System.out.println(s4.startsWith(" THE "));
System.out.println(s4.endsWith("GOOD"));
String s7="My name is Bhagyashree";
String[]ar=s7.split("");
System.out.println(ar.length);

for(int i=0;i<=ar.length-1;i++) 
{
	System.out.println(ar[i]);
}

}
	
	
	
}
