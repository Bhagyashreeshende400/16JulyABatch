package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
public static void main(String[] args) 
{
	Vector V=new Vector();
	V.add("Ram");
	V.add(34);
	V.add('B');
	V.add(87.4f);
	V.add(null);
	V.add(null);
	
	System.out.println(V);
	System.out.println(V.isEmpty());
	System.out.println(V.contains('B'));
	System.out.println(V.size());
	
	V.remove(0);
	System.out.println(V);
	V.set(0, "Bhagyashree");
	System.out.println(V);
	System.out.println(V.get(1));
	System.out.println("--print Vl info from Vector using iterator cursor---");
Iterator itr = V.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}
for(int i=0;i<=V.size()-1;i++)
{
	System.out.println(V.get(i));
}
for(Object s1:V)
{
	System.out.println(s1);
}
ListIterator litr = V.listIterator();
while(litr.hasNext())
{
	System.out.println(litr.next());
}
System.out.println("Print all data using for loop");
for(int i=0;i<=V.size()-1;i++)
{
	System.out.println(V.get(i));
}
System.out.println("Print all data using for each loop");
for(Object s1:V)
{
	System.out.println(s1);
}
System.out.println("Print all data using enumeration");
Enumeration enu = V.elements();
while(enu.hasMoreElements())
{
	System.out.println(enu.nextElement());
}
}
}
