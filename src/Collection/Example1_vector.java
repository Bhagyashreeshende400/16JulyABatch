package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class Example1_vector 
{
public static void main(String[] args) 
{
	Vector V=new Vector();
V.add("Bhagyashree");
V.add("pooja");
V.add('A');
V.add(25);
V.add(65.4f);
V.add(null);
V.add(null);

System.out.println(V.capacity());
System.out.println(V);
System.out.println(V.size());
System.out.println(V.isEmpty());
System.out.println(V.contains("pooja"));
System.out.println(V.get(4));
//add info in between Vector    --> right shift operation

System.out.println(V);
V.add(5,"Shekhar");

System.out.println(V);

//remove info in between Vector --> left shift operation

V.remove(2);
System.out.println(V);
//update/modify info from Vector

V.set(3, 10);
System.out.println(V);

System.out.println("--print Vl info from Vector using iterator cursor---");
Iterator itr = V.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("--print Vl info from Vector using ListIterator cursor---");

ListIterator litr=V.listIterator();
while(litr.hasNext())
{
	System.out.println(litr.next());
}
System.out.println("--print Vl data using for loop---");
for( int i=0; i<=V.size()-1;i++)
{
	System.out.println(V.get(i));
}
System.out.println("--print Vl data using foreach loop---");
for(Object s1:V)
{
	System.out.println(s1);
}
System.out.println("-------print all data using enumeration cursor-------");
Enumeration enu = V.elements();
while(enu.hasMoreElements())
{
	System.out.println(enu.nextElement());
}
}
}
