package AbstractConcrete;

public class example5 extends Example4 
{
public void m3(String name)
{
	System.out.println("m3:paru");
}
public static void main(String[] args) 
{
	example5 data=new example5();
	data.m1("Pooja");
	data.m2("Payal");
	data.m3("Paru");

}
}