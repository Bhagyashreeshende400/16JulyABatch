package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Generic1 
{
public static void main(String[] args) 
{
TreeSet<Integer> tr=new TreeSet<Integer>();    //generic
tr.add(500);
tr.add(600);
tr.add(100);
tr.add(200);
tr.add(300);
tr.add(700);
tr.add(400);
tr.add(100);


System.out.println(tr);

System.out.println("-----print all data-------");

for(Integer s1:tr)

{
	System.out.println(s1);
}
System.out.println("-----print all data using itreator-------");
Iterator<Integer> itr = tr.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
