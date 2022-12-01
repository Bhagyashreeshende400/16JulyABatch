package sampleCasting;

public class Son extends Father     //SuperClass
{

	public void Bike()
	{
		System.out.println("Bike:FZ");
	}
	public void car()
	{
		System.out.println("Car: BMW");
	}
	//public void Home()
	//{
		//System.out.println("Home:2BHK");
	//}
	public void Money()
	{
		System.out.println("Money:1L");
	}	


//create object of subclass with reference of super class

	public static void main(String[]args)

	{
Father s=new Son();      //Upcasting---> Father 
	s.car();
	s.Money();	
	s.Home();	
	
	}
}













