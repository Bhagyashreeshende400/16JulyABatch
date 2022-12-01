package Collection;

import java.util.ArrayList;
import java.util.Enumeration;

public class Example2_Arraylist 
{
public static void main(String[] args) 
{
	ArrayList data=new ArrayList();
	data.add("Shende");
	data.add(7);
	data.add('A');
	data.add(80.5f);
	
	
	System.out.println(data.size());
	System.out.println(data.get(3));
	System.out.println(data.contains("Shende"));
	System.out.println(data.isEmpty());
	System.out.println(data);
	
	}
}

