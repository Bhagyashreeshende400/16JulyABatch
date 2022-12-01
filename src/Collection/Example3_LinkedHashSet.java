package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example3_LinkedHashSet 
{
public static void main(String[] args)
{
	LinkedHashSet lhs=new LinkedHashSet();
lhs.add("Pooja");
lhs.add("Shekhar");
lhs.add(12);
lhs.add(45.5f);
lhs.add('A');
lhs.add(null);
lhs.add(null);

System.out.println(lhs);
System.out.println(lhs.size());
System.out.println(lhs.isEmpty());
System.out.println(lhs.contains('B'));
//remove info from haslhset
lhs.remove('A');
System.out.println(lhs);
System.out.println("--print all data from haslhset using Iterator--");
Iterator itr = lhs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
System.out.println("-----print all data using foreach-----");
for(Object s1:lhs)
{
	System.out.println(s1);
}
}
}
