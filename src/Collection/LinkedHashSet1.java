package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
public static void main(String[] args) 
{
LinkedHashSet LHS=new LinkedHashSet();	

LHS.add("Ajay");
LHS.add("Rahul");
LHS.add(33);
LHS.add('A');
LHS.add(66.8f);
LHS.add(null);
LHS.add(null);
LHS.add("Ajay");


System.out.println(LHS);
System.out.println(LHS.size());
System.out.println(LHS.isEmpty());
System.out.println(LHS.contains("Ajay"));
System.out.println(LHS.contains("Ram"));


//remove info from haslhset
LHS.remove('A');
System.out.println(LHS);

System.out.println("--print all data from haslhset using Iterator--");
Iterator itr = LHS.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("--print all data from haslhset using for each loop--");
for(Object m1:LHS)
{
	System.out.println(m1);
}






}
}
