package AbstractConcrete;
//concrete class or sub class or complete class

public class Demo2 extends Demo1
{
	 public void m3()      //Method Declaration
	 {
		 System.out.println("method m3 completed in concrete class");
	 }
	 public void m4()    //method deeclaration
	 {
	 System.out.println("method m4 completed in concrete class");
	 }
		 public static void main(String[] args) 
		 {
			Demo2 d2=new Demo2();
			d2.m1();
			d2.m2();
			d2.m3();
			d2.m4();
			 
			 
			 
		 }
	 
	 
	 
	 }
	  
	 

