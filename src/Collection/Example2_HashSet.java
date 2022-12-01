package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Example2_HashSet 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("Rahul");
	al.add(101);
	al.add('A');
	al.add(65.5f);
	al.add("Rahul");
	al.add(null);
	al.add(null);

	
System.out.println(al);
//remove double data
HashSet hs=new HashSet(al);
System.out.println(hs);
}
}
