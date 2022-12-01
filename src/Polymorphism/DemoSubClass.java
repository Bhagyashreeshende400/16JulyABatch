package Polymorphism;

public class DemoSubClass extends DemoMainClass 
{
public void WaterTank()
{
	System.out.println("WaterTank: Overflow");
}
//Method Overrider
public void Box()
{
	System.out.println("Box: Full");//empty-->Full
}
public void Bottle()
{
	System.out.println("Bottle: Half");//full-->Half
}
public void Gas()
{
	System.out.println("Gas: CNG");//CNG-->LPG
}
public static void main(String[] args) 
{
	DemoSubClass d=new DemoSubClass();
	d.Box();
	d.Bottle();
	d.Gas();
	
}




}
