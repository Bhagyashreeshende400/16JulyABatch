package InterfaceImplementation;

public class BoxClass implements Box1,Box2 
{
public void Info(String a)
{
	System.out.println(a);
}
public void Info2(String b)
{
	System.out.println(b);
}
	public static void main(String[] args)
	{
		BoxClass b=new BoxClass();
		b.Info("Pooja Patil");
		b.Info2("Rahul Patil");
		
}
	@Override
	public void Info2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		
	}	
	}
