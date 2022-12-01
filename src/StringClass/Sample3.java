package StringClass;

public class Sample3 
{
public static void main(String[] args) 
{
	String s1="velocity";
	String s2="VELOCITY";
System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());

s1=s1.toLowerCase();
System.out.println(s1);
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

}
}
