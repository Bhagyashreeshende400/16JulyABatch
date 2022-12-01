package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
public static void main(String[] args)
{
	HashSet hs1=new HashSet();
	hs1.add("Ajay");
	hs1.add("Rahul");
	hs1.add(33);
	hs1.add('A');
	hs1.add(66.8f);
	hs1.add(null);
	hs1.add(null);
	hs1.add("Ajay");

System.out.println(hs1);//Randomly get output
System.out.println(hs1.size());
System.out.println(hs1.containsAll(hs1));
System.out.println(hs1.contains(34));
System.out.println(hs1.isEmpty());
hs1.remove("Rahul");
System.out.println(hs1);
System.out.println("--print all data from hashset using Iterator--");	
Iterator itr = hs1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("--print all data from hashset using for each loop--");	
for(Object s1:hs1)
{
	System.out.println(s1);
}





}
}
