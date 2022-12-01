package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2_UsingArraylist
{
public static void main(String[] args)
{
	ArrayList arl=new ArrayList(); 
	arl.add("Ajay");
	arl.add("Rahul");
	arl.add(33);
	arl.add('A');
	arl.add(66.8f);
	arl.add(null);
	arl.add(null);
	arl.add("Ajay");
	
	System.out.println(arl);
	HashSet hs1=new HashSet(arl);
	System.out.println(hs1);
}
}
