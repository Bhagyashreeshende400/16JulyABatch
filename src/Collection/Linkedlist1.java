package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 
{
public static void main(String[] args)
{
	LinkedList LL=new LinkedList();

LL.add("Bhagyashree");
LL.add("pooja");
LL.add('A');
LL.add(50);
LL.add(66.9f);
LL.add(null);

System.out.println(LL);
System.out.println(LL.size());
System.out.println(LL.isEmpty());
System.out.println(LL.contains(51));

//remove/delete info in between LinkedList

LL.remove(1);

System.out.println(LL);

//modify/update info
LL.set(1, "Ram");
System.out.println(LL);
System.out.println("-----print all data using Iterator cursor ------");
Iterator itr = LL.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("-----print all data using ListIterator cursor ------");

ListIterator litr = LL.listIterator();
while(litr.hasNext())
		{
	System.out.println(litr.next());
		}
System.out.println("-----print all data using for loop ------");
for(int i=0;i<=LL.size()-1;i++)
{
System.out.println(LL.get(i));	
}

System.out.println("-----print all data using foreach loop ------");
for(Object s1:LL)
{
	System.out.println(s1);
}

}
}
