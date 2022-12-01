package Polymorphism;

public class Son extends Father 
//Sub/child class
{
public void bike()
{
	System.out.println("Bike:FZ V3");
}
//method override
public void car()
{
	System.out.println("Car: Rolls Roice");
}
//method override
public void Money()
{
	System.out.println("Money: 20L");
}
//method override
public void Home()
{
	System.out.println("Home: 3BHK");
}
public static void main(String[] args) 
{
Son s=new Son();
s.car();
s.Money();
s.Home();	
s.bike();	
	
	
}



}
