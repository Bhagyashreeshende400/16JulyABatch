package StringClass;

public class Sample2 
{
public static void main(String[] args) 
{
	//without using new keyword

String s1="Bhagyashree Shende";
String s2="Hello";
String s3="Hello";

System.out.println(s1.length());
System.out.println(s2);
System.out.println(s3);


// with using new keyword

String d1=new String("Hello");
String d2=new String("Hello Welcome");

System.out.println(d1);
System.out.println(d2);
System.out.println(d1.length());
}
}
