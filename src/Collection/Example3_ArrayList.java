package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Example3_ArrayList 
{
private static char[] s1;

public static void main(String[] args)
{
	ArrayList al=new ArrayList();

	al.add("Shende");
	al.add(7);
	al.add('A');
	al.add(80.5f);
	//add info in between arraylist    --> right shift operation
System.out.println(al);

al.add(2, "Pooja");
System.out.println(al);
//remove info in between arraylist --> left shift operation
al.remove(1);
System.out.println(al);

//update/modify info from arraylist
al.set(2, "Om Namh Shivy");
System.out.println(al);

System.out.println("--print all info from arraylist using iterator cursor---");
 Iterator itr = al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("--print all info from arraylist using ListIterator cursor---");
 ListIterator litr = al.listIterator();

while(litr.hasNext())
{
	System.out.println(litr.next());
}
System.out.println("--print all data using for loop---");

for(int i=0;i<=al.size()-1;i++)
{
	System.out.println(al.get(i));
}
System.out.println("--print all data using foreach loop---");

for(Object s1:al)//Object is used when don't know about type of data
{
	System.out.println(s1);
}








}
}
