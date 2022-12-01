package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{
public static void main(String[] args) 
{
ArrayList al=new ArrayList();
al.add("Ram");
al.add('A');
al.add(22);
al.add(66.7f);
al.add(null);
al.add(null);
System.out.println("............Print all Original Data............");
System.out.println(al);

System.out.println(al.size());
System.out.println(al.isEmpty());
System.out.println(al.contains(22));
al.remove(2);
System.out.println(al);
System.out.println("--print all data from Arrayllist Iterator--");
Iterator itr = al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("--print all data from Arrayllist listIterator--");

ListIterator litr = al.listIterator();
while(litr.hasNext())
{
	System.out.println(litr.next());
}
System.out.println("--print all data from Arrayllist for loop--");
for(int i=0;i<=al.size()-1;i++)
{
	System.out.println(al.get(i));
}
System.out.println("-----print all data using foreach loop ------");
for(Object s1:al)
{
	System.out.println(s1);
}
}
}
