package InterfaceImplementation;

public class Sample2 implements Sample1 

{
public void add(int a, int b, int c)
{
	System.out.println(a+b+c);
}
public static void main(String[] args) 
{
	Sample2 s2=new Sample2();
	s2.add(10,20,20);
}
@Override
public void add() {
	// TODO Auto-generated method stub
	
}

}
