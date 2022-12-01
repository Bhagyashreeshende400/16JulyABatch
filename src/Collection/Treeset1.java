package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1
{
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
ts.add(100);
ts.add(300);
ts.add(700);
ts.add(800);
ts.add(400);
ts.add(200);


System.out.println(ts.isEmpty());
System.out.println(ts);
System.out.println(ts.size());
System.out.println(ts.contains(900));

ts.remove(400);
System.out.println(ts);

System.out.println(ts.first());
System.out.println(ts.last());
ts.pollFirst(); //remove 1st element from treeset
System.out.println(ts);

ts.pollLast();   //remove last element from treeset
System.out.println(ts);
System.out.println("-------print data using iterator cursor--------");

Iterator itr = ts.iterator();
while (itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("------print info in descending order--------");

Iterator ditr = ts.descendingIterator();
while (ditr.hasNext())
{
	System.out.println(ditr.next());
}
System.out.println("----print all data using for each loop-----");

for(Object s1:ts) 
{
System.out.println(s1);	
}

}
}
