package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example1_Hashset 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
hs.add("Shekhar");
hs.add(100);
hs.add(55.5f);
hs.add(null);
hs.add(null);
hs.add('A');

System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.isEmpty());
System.out.println(hs.contains(55.5f));
//remove information  from hashset
hs.remove('A');
System.out.println(hs);
System.out.println("--print all data from hashset using Iterator--");
Iterator itr = hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("-----print all data using foreach-----");
for(Object s1:hs)
{
	System.out.println(s1);
}
}
}
