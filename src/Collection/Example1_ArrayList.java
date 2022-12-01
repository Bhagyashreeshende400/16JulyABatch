package Collection;

import java.util.ArrayList;

public class Example1_ArrayList 
{
public static void main(String[] args) 
{
ArrayList al=new ArrayList();	
al.add("Bhagyashree");
al.add(12);
al.add(null);
al.add(null);
al.add(30.4f);

System.out.println(al);
System.out.println(al.size());
System.out.println(al.isEmpty());
System.out.println(al.contains("Bhagya"));
System.out.println(al.contains("Bhagyashree"));
System.out.println(al.get(0));







}
}
