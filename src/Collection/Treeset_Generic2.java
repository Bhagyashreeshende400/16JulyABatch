package Collection;

import java.util.TreeSet;

public class Treeset_Generic2 
{
public static void main(String[] args) 
{
	TreeSet<String> tr=new TreeSet<String>();

tr.add("Ram");
tr.add("Rak");
tr.add("Ram");
tr.add("Rat");
tr.add("Rao");
tr.add("Rap");
//tr.add(10);

System.out.println(tr);
System.out.println("-----print all data-------");
for(Object s1:tr)
{
	System.out.println(s1);
}

}
}
